package Visitor;

import Structure.atomic.Atomic;
import Structure.atomic.Literal;
import Structure.atomic.Variable;
import Structure.binary.Divide;
import Structure.binary.Minus;
import Structure.binary.Multiply;
import Structure.binary.Plus;

public class Printer extends Visitor<String> {
	
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

	@Override
	public String visitPlus(Plus plus) {
		return "(" + plus.getOperand1().accept(this) + "+" + plus.getOperand2().toString() + ")";
	}

	@Override
	public String visitDivide(Divide divide) {
		return "(" + divide.getOperand1().toString() + "/" + divide.getOperand2().toString() + ")";
	}

	@Override
	public String visitMultiply(Multiply multiply) {
		return "(" + multiply.getOperand1().toString() + "*" + multiply.getOperand2().toString() + ")";
	}

	@Override
	public String visitMinus(Minus minus) {
		return "(" + minus.getOperand1().toString() + "-" + minus.getOperand2().toString() + ")";
	}
}
