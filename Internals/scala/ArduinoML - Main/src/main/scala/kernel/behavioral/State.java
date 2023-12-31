package kernel.behavioral;

import kernel.NamedElement;
import kernel.generator.Visitable;
import kernel.generator.Visitor;

import java.util.ArrayList;
import java.util.List;

public class State implements NamedElement, Visitable {

    private String name;
    private List<Action> actions = new ArrayList<Action>();
    private Transition transition;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public Transition getTransition() {
        return transition;
    }

    public void setTransition(Transition transition) {
        this.transition = transition;
    }
    private List<TemporalTransition> temporalTransitions = new ArrayList<>();
    public void addTemporalTransition(TemporalTransition temporalTransition) {
        temporalTransitions.add(temporalTransition);
    }

    public List<TemporalTransition> getTemporalTransitions() {
        return temporalTransitions;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}