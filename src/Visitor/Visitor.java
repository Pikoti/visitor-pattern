package Visitor;


import Structure.Environment;
import Structure.atomic.Atomic;
import Structure.atomic.Literal;
import Structure.atomic.Variable;
import Structure.binary.Binary;

public abstract class Visitor <T> {
	public abstract T visitBinary(Binary binary, Environment env);
	public abstract T visitAtomic(Atomic atomic,Environment env);
	public abstract T visitLiteral(Literal literal,Environment env);
	public abstract T visitVariable(Variable variable,Environment env);
}
