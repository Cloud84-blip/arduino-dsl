package main.kernel.behavioral;

import main.kernel.generator.Visitable;

public abstract class Transition implements Visitable {

	private State next;


	public State getNext() {
		return next;
	}

	public void setNext(State next) {
		this.next = next;
	}

	public abstract int getType();
}
