package kernel.behavioral;

import kernel.generator.Visitable;
import kernel.generator.Visitor;
import kernel.structural.*;
import kernel.behavioral.State;

import java.util.ArrayList;
import java.util.List;

public class Transition implements Visitable {
    private State next;
    private Sensor sensor;
    private SIGNAL value;
    private List<Condition> conditions = new ArrayList<>();



    public State getNext() {
        return next;
    }

    public void setNext(State next) {
        this.next = next;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public SIGNAL getValue() {
        return value;
    }

    public void setValue(SIGNAL value) {
        this.value = value;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void addCondition(Condition condition) {
        conditions.add(condition);
    }

    public List<Condition> getConditions() {
        return conditions;
    }
}