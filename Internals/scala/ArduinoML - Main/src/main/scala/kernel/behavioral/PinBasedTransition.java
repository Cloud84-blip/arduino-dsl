package kernel.behavioral;

import kernel.generator.Visitable;
import kernel.generator.Visitor;
import kernel.structural.*;
import kernel.structural.SIGNAL;

public class PinBasedTransition extends Transition {

    private SIGNAL secondValue;

    public SIGNAL getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(SIGNAL secondValue) {
        this.secondValue = secondValue;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
