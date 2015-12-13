package Visitor;

import Structure.Environment;
import Structure.atomic.Atomic;
import Structure.atomic.Literal;
import Structure.atomic.Variable;
import Structure.binary.Binary;

public class Printer extends Visitor<String> {
	
	@Override
	public String visitBinary(Binary binary,Environment en) {
		return "(" + binary.getOperand1().toString() + binary.getOperator() + binary.getOperand2().toString() + ")";
	}

	@Override
	public String visitAtomic(Atomic atomic,Environment en) {
		return this.toString();
	}

	@Override
	public String visitLiteral(Literal literal,Environment en) {
		return literal.getValue().toString();
	}

	@Override
	public String visitVariable(Variable variable,Environment en) {
		return variable.getName();
	}
}
