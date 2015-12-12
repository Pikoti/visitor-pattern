package Visitor;

import Structure.atomic.Atomic;
import Structure.atomic.Literal;
import Structure.atomic.Variable;
import Structure.binary.Binary;


public class Evaluator extends Visitor<Integer> {

	@Override
	public Integer visitBinary(Binary binary) {
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}
}
