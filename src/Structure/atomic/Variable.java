package Structure.atomic;

import Visitor.Visitor;

public class Variable extends Atomic {

	protected String name;
	
	public Variable(String name) {
		this.name = name;
	}
	
	public void accept(Visitor visitor) {
		
	}

}
