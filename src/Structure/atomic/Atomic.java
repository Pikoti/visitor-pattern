package Structure.atomic;
import Structure.Expression;
import Visitor.Visitor;

public class Atomic extends Expression {

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitAtomic(this);
	}

}
