package Visitor;

import Structure.Environment;
import Structure.atomic.Atomic;
import Structure.atomic.Literal;
import Structure.atomic.Variable;
import Structure.binary.Binary;


public class Evaluator extends Visitor<Integer> {

	@Override
	public Integer visitBinary(Binary binary,Environment en) {
		return null;
	}

	@Override
	public Integer visitAtomic(Atomic atomic,Environment en) {
		return null;
	}

	@Override
	public Integer visitLiteral(Literal literal,Environment en) {
		return literal.getValue();
	}

	@Override
	public Integer visitVariable(Variable variable,Environment en) {
		// TODO Auto-generated method stub
		return null;
	}
}
