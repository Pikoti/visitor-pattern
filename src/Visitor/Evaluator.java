package Visitor;

import Structure.atomic.Atomic;
import Structure.atomic.Literal;
import Structure.binary.Binary;
import Structure.binary.Divide;
import Structure.binary.Minus;
import Structure.binary.Multiply;
import Structure.binary.Plus;


public class Evaluator extends Visitor<Integer> {

	@Override
	public Integer visitBinary(Binary binary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitAtomic(Atomic atomic) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitLiteral(Literal literal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitPlus(Plus plus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitMinus(Minus minus) {
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

	
}
