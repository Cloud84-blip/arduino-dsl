package generator

import model._

object ArduinoCodeGenerator {
  def generate(app: App): String = {
    val setupCode = generateSetup(app.components)
    val loopCode = generateLoop(app.states)

    s"""
       |void setup() {
       |${setupCode.mkString("\n")}
       |}
       |
       |void loop() {
       |${loopCode.mkString("\n")}
       |}
       |""".stripMargin
  }

  private def generateSetup(components: List[Component]): Seq[String] =
    components.map {
      case alarm: Alarm => s"  pinMode(${alarm.pin}, OUTPUT);"
      case sensor: Sensor => s"  pinMode(${sensor.pin}, INPUT);"
    }

  private def generateLoop(states: List[State]): Seq[String] = {
    val stateLogic = states.flatMap { state =>
      state.transitions.flatMap {
        case toggleTrans: ToggleTransition =>
          Some(generateToggleLogic(toggleTrans))

        case pinBasedTrans: PinBasedTransition =>
          Some(generatePinBasedLogic(state, pinBasedTrans))

        case _ => None
      }
    }

    stateLogic
  }

  private def generateToggleLogic(toggleTrans: ToggleTransition): String = {
    s"""
       |  if (digitalRead(${toggleTrans.sensor.pin}) == HIGH) {
       |    digitalWrite(${toggleTrans.component.pin}, !digitalRead(${toggleTrans.component.pin}));
       |    delay(200); // Debouncing delay
       |  }
       |""".stripMargin
  }

  private def generatePinBasedLogic(state: State, trans: PinBasedTransition): String = {
    val conditions = trans.sensors.zip(trans.signals).map {
      case (sensor, signal) => s"digitalRead(${sensor.pin}) == ${signal.toString}"
    }.mkString(" && ")

    val actions = state.actions.map { action =>
      s"digitalWrite(${action.component.pin}, ${action.signal.toString});"
    }.mkString("\n    ")

    s"""
       |  if ($conditions) {
       |    $actions
       |  }
       |""".stripMargin
  }


}
