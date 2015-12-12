package Structure;

import Visitor.Visitor;

public abstract class Expression {

	public abstract <T> void accept(Visitor<T> visitor);

}
