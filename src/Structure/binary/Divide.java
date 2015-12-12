package Structure.binary;

import Structure.Expression;

public class Divide extends Binary{
	public Divide (Expression e1, Expression e2){
		super(e1,e2);
		this.operator = "/";
	}
}
