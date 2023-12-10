package scenarios

import dsl.ArduinoML

object SimpleAlarm extends App with ArduinoML {

  this hasForName "SimpleAlarm"

  // Declaring the bricks involved in the application
  val button = declare.aSensor()   named "button" boundToPin 10
  val led    = declare.anActuator() named "led"    boundToPin 9
  val buzzer = declare.anActuator() named "buzzer" boundToPin 12

  // Declaring the states
  val alarmOn = state named "alarmOn" executing (led --> high, buzzer --> high)
  val alarmOff = state named "alarmOff" executing (led --> low, buzzer --> low)

  // Setting the initial state
  alarmOff.isInitial

  // Declaring the transition system
  transitions {
    alarmOn -> alarmOff when (button is low)
    alarmOff -> alarmOn when (button is high)
  }

  // Running the code generation tool
  exportToWiring

}
