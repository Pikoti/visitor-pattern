package Structure;

import Visitor.Visitor;

public abstract class Expression {

	public abstract <T> T accept(Visitor<T> visitor);
}
