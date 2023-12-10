import dsl.ArduinoMLDSL
import generator.ArduinoCodeGenerator
import model._

object SimpleAlarmScenario {
  def main(args: Array[String]): Unit = {
    val dsl = new ArduinoMLDSL

    val alarm = dsl.alarm(9)  // Alarm on pin 12
    val button = dsl.sensor(10) // Button (sensor) on pin 3

    // Define the "On" state with an associated action
    dsl.state("On")(
      dsl.pinBasedTransition(button, Signal.HIGH)
    ).action(alarm, Signal.HIGH)

    // Define the "Off" state with an associated action
    dsl.state("Off")(
      dsl.pinBasedTransition(button, Signal.LOW)
    ).action(alarm, Signal.LOW)

    // Build the application model
    val appModel = dsl.buildApp()

    // Generate Arduino code from the model
    val arduinoCode = ArduinoCodeGenerator.generate(appModel)
    println(arduinoCode)
  }
}
