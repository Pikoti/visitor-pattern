package Visitor;

import Structure.atomic.Atomic;
import Structure.atomic.Literal;
import Structure.atomic.Variable;
import Structure.binary.Binary;

public class Printer extends Visitor<String> {
	
	@Override
	public String visitBinary(Binary binary) {
		return "(" + binary.getOperand1().toString() + binary.getOperator() + binary.getOperand2().toString() + ")";
	}

	@Override
	public String visitAtomic(Atomic atomic) {
		return this.toString();
	}

	@Override
	public String visitLiteral(Literal literal) {
		return literal.getValue().toString();
	}

	@Override
	public String visitVariable(Variable variable) {
		return variable.getName();
	}
}
