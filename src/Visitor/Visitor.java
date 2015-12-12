package Visitor;

import Structure.atomic.Atomic;
import Structure.atomic.Literal;
import Structure.atomic.Variable;
import Structure.binary.Binary;

public abstract class Visitor <T> {
	public abstract T visitBinary(Binary binary);
	public abstract T visitAtomic(Atomic atomic);
	public abstract T visitLiteral(Literal literal);
	public abstract T visitVariable(Variable variable);
}
