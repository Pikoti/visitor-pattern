package Visitor;

import Structure.atomic.Atomic;
import Structure.atomic.Literal;
import Structure.binary.Binary;
import Structure.binary.Divide;
import Structure.binary.Minus;
import Structure.binary.Multiply;
import Structure.binary.Plus;

public abstract class Visitor <T> {
	public abstract T visitBinary(Binary binary);
	public abstract T visitAtomic(Atomic atomic);
	public abstract T visitLiteral(Literal literal);
	public abstract T visitPlus(Plus plus);
	public abstract T visitMinus(Minus minus);
	public abstract T visitDivide(Divide divide);
	public abstract T visitMultiply(Multiply multiply);
}
