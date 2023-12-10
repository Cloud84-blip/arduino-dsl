package scenarios

import dsl.ArduinoML

object StateBasedAlarm extends App with ArduinoML {

  this hasForName "StateBasedAlarm"

  // Declaring the bricks
  val button = declare.aSensor()   named "button" boundToPin 10 // Use an appropriate pin
  val led    = declare.anActuator() named "led"    boundToPin 9 // Use an appropriate pin

  // States
  val ledOn = state named "ledOn" executing (led --> high)
  val ledOff = state named "ledOff" executing (led --> low)

  // Initial state
  ledOff.isInitial

  // Transitions
  transitions {
    ledOn -> ledOff when (button is high)
    ledOff -> ledOn when (button is high)
  }

  // Code generation
  exportToWiring

}
