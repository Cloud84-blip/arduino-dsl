import dsl.ArduinoMLDSL
import generator.ArduinoCodeGenerator
import model._

object DualCheckAlarmScenario {
  def main(args: Array[String]): Unit = {
    val dsl = new ArduinoMLDSL

    // Define the components
    val alarm = dsl.alarm(9)       // Alarm on pin 12
    val button1 = dsl.sensor(10)     // Button 1 on pin 3
    val button2 = dsl.sensor(11)     // Button 2 on pin 4

    // Define the "AlarmOn" state: it requires both buttons to be pressed
    dsl.state("AlarmOn")(
      dsl.andTransition(List(button1, button2), List(Signal.HIGH, Signal.HIGH))
    ).action(alarm, Signal.HIGH)

    // Define the "AlarmOff" state: if either button is released, the alarm is off
    dsl.state("AlarmOff")(
      dsl.orTransition(List(button1, button2), List(Signal.LOW, Signal.LOW))
    ).action(alarm, Signal.LOW)

    // Build the application model
    val appModel = dsl.buildApp()

    // Generate and print the Arduino code
    val arduinoCode = ArduinoCodeGenerator.generate(appModel)
    println(arduinoCode)
  }
}
