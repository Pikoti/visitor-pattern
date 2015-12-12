package Structure;

import Visitor.Visitor;

public abstract class Expression {

	public abstract void accept(Visitor visitor);
	
}
