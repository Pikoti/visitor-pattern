package Structure.atomic;

import Visitor.Visitor;

public class Variable extends Atomic {

	protected String name;
	
	public Variable(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitVariable(this);
	}
}
