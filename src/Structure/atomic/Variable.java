package Structure.atomic;

import Visitor.Visitor;

public class Variable extends Atomic {

	protected String name;
	
	public Variable(String name) {
		this.name = name;
	}
	
	@Override
	public <T> void accept(Visitor<T> visitor) {
		// TODO Auto-generated method stub
		
	}
}
