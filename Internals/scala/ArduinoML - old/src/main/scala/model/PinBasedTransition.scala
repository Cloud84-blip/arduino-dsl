package model

case class PinBasedTransition(sensors: List[Sensor], signals: List[Signal.Value], logicalOperator: String = "NONE") extends Transition {
  require(sensors.size == signals.size, "The number of sensors must match the number of signals")
  require(Set("AND", "OR", "NONE").contains(logicalOperator.toUpperCase), "Logical operator must be 'AND', 'OR', or 'NONE'")
}
