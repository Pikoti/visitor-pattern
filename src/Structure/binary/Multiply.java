package Structure.binary;

import Structure.Expression;
import Visitor.Visitor;
public class Multiply extends Binary{

	public Multiply(Expression e1, Expression e2) {
		super(e1, e2,"*");
	}
	
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitMultiply(this);		
	}
}
