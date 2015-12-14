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
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitLiteral(this);
	}	

}
