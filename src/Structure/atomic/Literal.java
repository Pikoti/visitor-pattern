package Structure.atomic;

import Visitor.Visitor;

public class Literal extends Atomic {
	protected int value;
	
	public Literal(int value) {
		this.value = value;
	}
	
	public <T> void accept(Visitor<T> visitor) {
		// TODO Auto-generated method stub
	}	

}
