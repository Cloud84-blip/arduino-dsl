package main.dsl;


import main.kernel.behavioral.Action;
import main.kernel.structural.Alarm;
import main.kernel.structural.SIGNAL;

import java.util.Optional;

public class InstructionBuilder {

    private StateBuilder parent;

    private Action local =  new Action();

    InstructionBuilder(StateBuilder parent, String target) {
        this.parent = parent;
        Optional<Alarm> opt = parent.parent.findActuator(target);
        Alarm act = opt.orElseThrow(() -> new IllegalArgumentException("Illegal actuator: ["+target+"]"));
        local.setActuator(act);
    }

    public StateBuilder toHigh() { local.setValue(SIGNAL.HIGH); return goUp(); }

    public StateBuilder toLow() { local.setValue(SIGNAL.LOW); return goUp(); }

    private StateBuilder goUp() {
        parent.local.getActions().add(this.local);
        return parent;
    }

}
