package Structure.binary;

import Structure.Expression;
import Visitor.Visitor;

public class Minus extends Binary{
	public Minus(Expression e1, Expression e2) {
		super(e1, e2);
	}

	@Override
	public <T> void accept(Visitor<T> visitor) {
		// TODO Auto-generated method stub
	}
}
