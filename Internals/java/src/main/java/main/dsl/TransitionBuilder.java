package main.dsl;


import main.kernel.behavioral.PinBased;
import main.kernel.behavioral.Temporal;
import main.kernel.behavioral.Transition;
import main.kernel.structural.SIGNAL;

public class TransitionBuilder {


    private TransitionTableBuilder parent;

    private PinBased local;
    private Temporal temporal;

    TransitionBuilder(TransitionTableBuilder parent, String source) {
        this.parent = parent;
        this.local = new PinBased();
        this.temporal = new Temporal();
        parent.findState(source).setTransition(local);
    }


    public TransitionBuilder when(String sensor) {
        local.setSensors(parent.findSensor(sensor));
        return this;
    }

    public TransitionBuilder and(String sensor) {
        local.addSensor(parent.findSensor(sensor));
        return this;
    }

    public TransitionBuilder whenTime(Integer duration) {
        temporal.setDuration(duration);
        return this;
    }

    public TransitionBuilder isHigh() {
        local.setValues(SIGNAL.HIGH);
        return this;
    }

    public TransitionBuilder isLow() {
        local.setValues(SIGNAL.LOW);
        return this;
    }

    public TransitionTableBuilder goTo(String state) {
        local.setNext(parent.findState(state));
        return parent;
    }


}
