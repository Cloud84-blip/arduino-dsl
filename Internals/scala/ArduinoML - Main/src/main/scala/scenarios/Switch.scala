package scenarios

import dsl.ArduinoML


object Switch extends App with ArduinoML {

  this hasForName "Switch!"

  val button = declare.aSensor()    named "button" boundToPin 11
  val led    = declare.anActuator() named "led"    boundToPin 9


  val on  = state named "on"  executing led --> high
  val off = state named "off" executing led --> low

  off.isInitial

  transitions {
    on -> off when (button is high)
    off -> on when (button is high)
  }

  // Running the code generation tool
  exportToWiring

}
