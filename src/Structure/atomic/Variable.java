package Structure.atomic;

import Structure.Environment;
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
	public <T> void accept(Visitor<T> visitor,Environment en) {
		visitor.visitVariable(this,en);
	}
}
