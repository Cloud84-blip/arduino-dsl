package scenarios

import dsl.ArduinoML

object DualCheckAlarm extends App with ArduinoML {

  this hasForName "DualCheckAlarm"

  // Declaring the bricks
  val button1 = declare.aSensor()   named "button1" boundToPin 10
  val button2 = declare.aSensor()   named "button2" boundToPin 11
  val buzzer  = declare.anActuator() named "buzzer"  boundToPin 9

  // States
  val alarmOn = state named "alarmOn" executing (buzzer --> high)
  val alarmOff = state named "alarmOff" executing (buzzer --> low)

  // Initial state
  alarmOff.isInitial

  // Transitions
  transitions {
    alarmOn -> alarmOff when (button1.is(low).or(button2, low))
    alarmOff -> alarmOn when (button1.is(high).and(button2, high))
  }

  // Code generation
  exportToWiring

}
