package main.kernel.behavioral;

import main.kernel.generator.Visitable;
import main.kernel.generator.Visitor;
import main.kernel.structural.Alarm;
import main.kernel.structural.SIGNAL;

public class Action implements Visitable {

	private SIGNAL value;
	private Alarm alarm;


	public SIGNAL getValue() {
		return value;
	}

	public void setValue(SIGNAL value) {
		this.value = value;
	}

	public Alarm getActuator() {
		return alarm;
	}

	public void setActuator(Alarm alarm) {
		this.alarm = alarm;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
