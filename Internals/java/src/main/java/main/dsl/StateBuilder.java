package main.dsl;


import main.kernel.behavioral.State;

public class StateBuilder {

    AppBuilder parent;
    State local = new State();

    StateBuilder(AppBuilder parent, String name) {
        this.parent = parent;
        local.setName(name);
    }

    public InstructionBuilder setting(String sensorName) {
        return new InstructionBuilder(this, sensorName);
    }

    public StateBuilder initial() { parent.theRoot.setInitial(this.local); return this; }

    public AppBuilder endState() { parent.theRoot.getStates().add(this.local); return parent; }

}