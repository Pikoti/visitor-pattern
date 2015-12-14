package Visitor;

import Structure.Environment;
import Structure.UnboundVariable;
import Structure.atomic.Atomic;
import Structure.atomic.Literal;
import Structure.atomic.Variable;
import Structure.binary.Divide;
import Structure.binary.Minus;
import Structure.binary.Multiply;
import Structure.binary.Plus;


public class Evaluator extends Visitor<Integer> {

	protected Environment env;
	
	protected void setEnvironment(Environment env) {
		this.env = env;
	}
	
	@Override
	public Integer visitAtomic(Atomic atomic) {
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitDivide(Divide divide) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitMultiply(Multiply multiply) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitMinus(Minus minus) {
		// TODO Auto-generated method stub
		return null;
	}
}
