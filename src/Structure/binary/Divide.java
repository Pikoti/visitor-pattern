package Structure.binary;

import Structure.Expression;
import Visitor.Visitor;

public class Divide extends Binary{
	public Divide (Expression e1, Expression e2){
		super(e1,e2,"/");
	}
	
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitDivide(this);		
	}
}
