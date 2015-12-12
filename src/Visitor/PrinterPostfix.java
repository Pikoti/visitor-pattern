package Visitor;

import Structure.atomic.Atomic;
import Structure.atomic.Literal;
import Structure.binary.Binary;
import Structure.binary.Divide;
import Structure.binary.Minus;
import Structure.binary.Multiply;
import Structure.binary.Plus;

public class PrinterPostfix extends Printer{

	@Override
	public String visitBinary(Binary binary) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String visitAtomic(Atomic atomic) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String visitLiteral(Literal literal) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String visitPlus(Plus plus) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String visitMinus(Minus minus) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String visitDivide(Divide divide) {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String visitMultiply(Multiply multiply) {
		// TODO Auto-generated method stub
		return "";
	}

}
