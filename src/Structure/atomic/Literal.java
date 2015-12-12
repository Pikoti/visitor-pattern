package Structure.atomic;

import Visitor.Visitor;

public class Literal extends Atomic {
	protected Integer value;
	
	public Literal(int value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}
	
	@Override
	public <T> void accept(Visitor<T> visitor) {
		visitor.visitLiteral(this);
	}	

}
