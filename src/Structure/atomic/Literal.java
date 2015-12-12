package Structure.atomic;

import Visitor.Visitor;

public class Literal extends Atomic {
	protected int value;
	
	public Literal(int value) {
		this.value = value;
	}
	
	public void accept(Visitor visitor) {
		
	}

}
