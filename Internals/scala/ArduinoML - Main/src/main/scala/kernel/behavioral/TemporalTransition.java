package kernel.behavioral;

import kernel.generator.Visitable;
import kernel.generator.Visitor;

public class TemporalTransition extends Transition {
    private long delay;
    private State sourceState; // The state from which this transition originates

    public TemporalTransition(State sourceState, long delay) {
        this.sourceState = sourceState;
        this.delay = delay;
    }

    public long getDelay() {
        return delay;
    }

    public void setDelay(long delay) {
        this.delay = delay;
    }
    public State getSourceState() {
        return sourceState;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
