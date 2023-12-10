package kernel;

import kernel.behavioral.State;
import kernel.behavioral.TemporalTransition;
import kernel.behavioral.Transition;
import kernel.generator.Visitable;
import kernel.generator.Visitor;
import kernel.structural.Brick;

import java.util.ArrayList;
import java.util.List;

public class App implements NamedElement, Visitable {

	private String name;
	private List<Brick> bricks = new ArrayList<Brick>();
	private List<State> states = new ArrayList<State>();
	private List<Transition> transitions = new ArrayList<>(); // List to hold all transitions
	private List<TemporalTransition> temporalTransitions = new ArrayList<>();


	private State initial;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public List<Brick> getBricks() {
		return bricks;
	}

	public void setBricks(List<Brick> bricks) {
		this.bricks = bricks;
	}

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

	public State getInitial() {
		return initial;
	}

	public void setInitial(State initial) {
		this.initial = initial;
	}

	public void addTransition(Transition transition) {
		transitions.add(transition);
	}

	public List<Transition> getTransitions() {
		return transitions;
	}

	public List<TemporalTransition> getTemporalTransitions() {
		return temporalTransitions;
	}

	public void addTemporalTransition(TemporalTransition temporalTransition) {
		temporalTransitions.add(temporalTransition);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
