import dsl.ArduinoMLDSL
import generator.ArduinoCodeGenerator
import model._

object StateBasedAlarmScenario {
  def main(args: Array[String]): Unit = {
    val dsl = new ArduinoMLDSL

    val led = dsl.alarm(9)
    val button = dsl.sensor(10)

    // Define a toggle transition
    val toggle = dsl.toggleTransition(button, led)

    // Build the app model with this toggle transition
    val appModel = dsl.buildApp()

    // Generate Arduino code
    val arduinoCode = ArduinoCodeGenerator.generate(appModel)
    println(arduinoCode)
  }
}

