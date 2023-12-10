package main.kernel.structural;

import main.kernel.generator.Visitor;

public class Alarm extends Component {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
