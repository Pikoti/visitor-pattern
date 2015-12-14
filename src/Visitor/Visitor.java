package Visitor;


import Structure.atomic.Literal;
import Structure.atomic.Variable;
import Structure.binary.Divide;
import Structure.binary.Minus;
import Structure.binary.Multiply;
import Structure.binary.Plus;

public abstract class Visitor <T> {
	
	public abstract T visitLiteral(Literal literal);
	public abstract T visitVariable(Variable variable);
	public abstract T visitPlus(Plus plus);
	public abstract T visitDivide(Divide divide);
	public abstract T visitMultiply(Multiply multiply);
	public abstract T visitMinus(Minus minus);
}
