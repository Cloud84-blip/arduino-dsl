package main.kernel.generator;

import main.kernel.behavioral.*;
import main.kernel.structural.*;
import main.kernel.Root;

import java.util.HashMap;
import java.util.Map;

public abstract class Visitor<T> {

	public abstract void visit(Root root);

	public abstract void visit(State state);

	public abstract void visit(Temporal transition);
	public abstract void visit(PinBased transition);

	public abstract void visit(Action action);

	public abstract void visit(Alarm alarm);
	public abstract void visit(Sensor sensor);


	/***********************
	 ** Helper mechanisms **
	 ***********************/

	protected Map<String,Object> context = new HashMap<>();

	protected T result;

	public T getResult() {
		return result;
	}

}

