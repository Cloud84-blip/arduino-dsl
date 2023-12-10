package kernel.behavioral;

import kernel.structural.Sensor;
import kernel.structural.SIGNAL;

public class Condition {
    private Sensor sensor;
    private SIGNAL signal;
    private String logicalOperator; // "and" or "or"

    public Condition(Sensor sensor, SIGNAL signal, String logicalOperator) {
        this.sensor = sensor;
        this.signal = signal;
        this.logicalOperator = logicalOperator;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public SIGNAL getSignal() {
        return signal;
    }

    public String getLogicalOperator() {
        return logicalOperator;
    }

    public boolean isAndCondition() {
        return "and".equals(logicalOperator);
    }

    public boolean isOrCondition() {
        return "or".equals(logicalOperator);
    }
}
