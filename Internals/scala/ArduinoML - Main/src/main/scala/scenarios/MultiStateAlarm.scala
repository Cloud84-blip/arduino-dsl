package scenarios

import dsl.ArduinoML

object MultiStateAlarm extends App with ArduinoML {

  this hasForName "MultiStateAlarm"

  // Declaring the bricks
  val button = declare.aSensor()   named "button" boundToPin 10
  val buzzer = declare.anActuator() named "buzzer" boundToPin 9
  val led    = declare.anActuator() named "led"    boundToPin 12

  // States
  val buzzerOn = state named "buzzerOn" executing (buzzer --> high, led --> low)
  val ledOn = state named "ledOn" executing (led --> high, buzzer --> low)
  val bothOff = state named "bothOff" executing (led --> low, buzzer --> low)

  // Initial state
  bothOff.isInitial

  // Transitions
  transitions {
    bothOff -> buzzerOn when (button is high)
    buzzerOn -> ledOn when (button is high)
    ledOn -> bothOff when (button is high)
  }

  // Code generation
  exportToWiring

}
