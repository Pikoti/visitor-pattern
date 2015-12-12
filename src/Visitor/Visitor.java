package Visitor;

import Structure.atomic.Atomic;
import Structure.atomic.Literal;
import Structure.binary.Binary;
import Structure.binary.Divide;
import Structure.binary.Minus;
import Structure.binary.Multiply;
import Structure.binary.Plus;

public abstract class Visitor {
	public abstract void visitBinary(Binary binary);
	public abstract void visitAtomic(Atomic atomic);
	public abstract void visitLiteral(Literal literal);
	public abstract void visitPlus(Plus plus);
	public abstract void visitMinus(Minus minus);
	public abstract void visitDivide(Divide divide);
	public abstract void visitMultiply(Multiply multiply);
}
