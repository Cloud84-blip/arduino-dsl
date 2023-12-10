package main.kernel;

import main.kernel.behavioral.State;
import main.kernel.generator.Visitable;
import main.kernel.generator.Visitor;
import main.kernel.structural.Component;

import java.util.ArrayList;
import java.util.List;

public class Root implements NamedElement, Visitable {

	private String name;
	private List<Component> components = new ArrayList<Component>();
	private List<State> states = new ArrayList<State>();
	private State initial;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public List<Component> getBricks() {
		return components;
	}

	public void setBricks(List<Component> components) {
		this.components = components;
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

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
