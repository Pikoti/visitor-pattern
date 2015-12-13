package Structure.binary;

import Structure.Environment;
import Structure.Expression;
import Visitor.Visitor;

public class Binary extends Expression{
	protected Expression operand2;
	protected Expression operand1;
	protected String operator;
	
	public Binary(Expression e1, Expression e2, String operator) {
		this.operand1 = e1;
		this.operand2 = e2;
		this.operator = operator;
	}

	public String getOperator() {
		return operator;
	}
	
	public Expression getOperand1() {
		return operand1;
	}
	
	public Expression getOperand2() {
		return operand2;
	}

	@Override
	public <T> void accept(Visitor<T> visitor, Environment en) {
		operand1.accept(visitor, en);
		operand2.accept(visitor, en);
		visitor.visitBinary(this,en);		
	}
}
