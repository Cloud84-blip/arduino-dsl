package scenarios

import dsl.ArduinoML
import scenarios.StateBasedAlarm.{led, state}


object TemporalAlarm extends App with ArduinoML {

  this hasForName "TemporalAlarm"

  // Declaring bricks
  val button = declare.aSensor() named "button" boundToPin 10
  val led = declare.anActuator() named "led" boundToPin 9

  // States
  val ledOn = state named "ledOn" executing (led --> high)
  val ledOff = state named "ledOff" executing (led --> low)

  // Initial state
  ledOff.isInitial

  // Transitions
  transitions {
    ledOff -> ledOn when (button is high)
    ledOn after 800 to ledOff // 800ms after ledOn, go to waiting
  }

  // Code generation
  exportToWiring
}