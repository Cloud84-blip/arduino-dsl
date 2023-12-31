package kernel.structural;

import kernel.generator.Visitor;

public class Sensor extends Brick {
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
