package Structure.binary;

import Structure.Expression;
import Visitor.Visitor;

public class Minus extends Binary{
	public Minus(Expression e1, Expression e2) {
		super(e1, e2,"-");
	}

	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitMinus(this);		
	}
}
