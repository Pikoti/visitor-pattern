package Visitor;

import Structure.atomic.Literal;
import Structure.atomic.Variable;
import Structure.binary.Divide;
import Structure.binary.Minus;
import Structure.binary.Multiply;
import Structure.binary.Plus;

public class Printer extends Visitor<String> {

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
		return "(" + plus.getOperand1().accept(this) + "+" + plus.getOperand2().accept(this) + ")";
	}

	@Override
	public String visitDivide(Divide divide) {
		return "(" + divide.getOperand1().accept(this) + "/" + divide.getOperand2().accept(this) + ")";
	}

	@Override
	public String visitMultiply(Multiply multiply) {
		return "(" + multiply.getOperand1().accept(this) + "*" + multiply.getOperand2().accept(this) + ")";
	}

	@Override
	public String visitMinus(Minus minus) {
		return "(" + minus.getOperand1().accept(this) + "-" + minus.getOperand2().accept(this) + ")";
	}
}
