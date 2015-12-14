package Visitor;

import Structure.Environment;
import Structure.UnboundVariable;
import Structure.atomic.Literal;
import Structure.atomic.Variable;
import Structure.binary.Divide;
import Structure.binary.Minus;
import Structure.binary.Multiply;
import Structure.binary.Plus;


public class Evaluator extends Visitor<Integer> {

	protected Environment env;
	
	public void setEnvironment(Environment env) {
		this.env = env;
	}
	
	@Override
	public Integer visitLiteral(Literal literal) {
		return literal.getValue();
	}

	@Override
	public Integer visitVariable(Variable variable) {
			try {
				return env.getValue(variable).getValue();
			} catch (UnboundVariable e) {
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public Integer visitPlus(Plus plus) {
		return plus.getOperand1().accept(this) + plus.getOperand2().accept(this);
	}

	@Override
	public Integer visitDivide(Divide divide) {
		return divide.getOperand1().accept(this) / divide.getOperand2().accept(this);
	}

	@Override
	public Integer visitMultiply(Multiply multiply) {
		return multiply.getOperand1().accept(this) * multiply.getOperand2().accept(this);
	}

	@Override
	public Integer visitMinus(Minus minus) {
		return minus.getOperand1().accept(this) - minus.getOperand2().accept(this);
	}
}
