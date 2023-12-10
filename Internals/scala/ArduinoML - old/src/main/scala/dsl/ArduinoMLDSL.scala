package dsl

import generator.ArduinoCodeGenerator
import model._

import scala.language.dynamics

class ArduinoMLDSL extends Dynamic {
  private var components: List[Component] = List()
  private var states: List[State] = List()
  private var currentState: Option[State] = None

  def component(name: String, pin: Int) = new {
    def as(t: String): Component = {
      val component = t.toLowerCase match {
        case "alarm" => new Alarm(pin)
        case "sensor" => new Sensor(pin)
        case _ => throw new IllegalArgumentException("Unknown component type")
      }
      components = components :+ component
      component
    }
  }

  def state(name: String)(transitions: Transition*) = {
    val state = State(name, transitions.toList, List())
    states = states :+ state
    currentState = Some(state)
    new {
      def action(component: Component, signal: Signal.Value): Unit = {
        val updatedState = state.addAction(Action(component, signal))
        states = states.map {
          case s if s.name == state.name => updatedState
          case s => s
        }
      }
    }
  }

  def sensor(pin: Int): Sensor = {
    val sensor = new Sensor(pin)
    components = components :+ sensor
    sensor
  }

  def alarm(pin: Int): Alarm = {
    val alarm = new Alarm(pin)
    components = components :+ alarm
    alarm
  }

  def pinBasedTransition(sensor: Sensor, signal: Signal.Value): PinBasedTransition =
    PinBasedTransition(List(sensor), List(signal))


  def temporalTransition(duration: Long): TemporalTransition = TemporalTransition(duration)

  def andTransition(sensors: List[Sensor], signals: List[Signal.Value]): PinBasedTransition =
    PinBasedTransition(sensors, signals, "AND")

  def orTransition(sensors: List[Sensor], signals: List[Signal.Value]): PinBasedTransition =
    PinBasedTransition(sensors, signals, "OR")

  def toggleTransition(sensor: Sensor, component: Component): Unit = {
    val transition = ToggleTransition(sensor, component)
    // Assuming currentState holds the state to which this transition should be added
    currentState match {
      case Some(state) =>
        val updatedState = state.copy(transitions = state.transitions :+ transition)
        states = states.map(s => if (s.name == state.name) updatedState else s)
      case None => throw new IllegalStateException("No current state defined for adding toggle transition")
    }
  }

  def buildApp(): App = App(components, states)

  class StateBuilder(private val state: State, private val dsl: ArduinoMLDSL) {
    def action(component: Component, signal: Signal.Value): ArduinoMLDSL = {
      val newAction = Action(component, signal)
      val updatedState = state.copy(actions = state.actions :+ newAction)
      dsl.states = dsl.states.map(s => if (s.name == state.name) updatedState else s)
      dsl
    }
  }

  def toggleState(name: String, sensor: Sensor, component: Component, initialState: Signal.Value): Unit = {
    val onState = State(name + "_On", List(PinBasedTransition(List(sensor), List(Signal.HIGH))), List(Action(component, Signal.HIGH)))
    val offState = State(name + "_Off", List(PinBasedTransition(List(sensor), List(Signal.HIGH))), List(Action(component, Signal.LOW)))

    states = states :+ (if (initialState == Signal.HIGH) onState else offState)
    components = components :+ sensor :+ component
  }

  def generateArduinoCode(): String = {
    ArduinoCodeGenerator.generate(buildApp())
  }

}

