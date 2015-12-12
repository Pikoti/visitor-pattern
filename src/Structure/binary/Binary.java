package Structure.binary;

import Structure.Expression;
import Visitor.Visitor;

public class Binary extends Expression{
	protected Expression operand2;
	protected Expression operand1;
	
	public Binary(Expression e1, Expression e2) {
		this.operand1 = e1;
		this.operand2 = e2;
	}

	@Override
	public <T> void accept(Visitor<T> visitor) {
		// TODO Auto-generated method stub
	}
}
