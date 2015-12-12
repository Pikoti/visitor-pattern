package Structure.atomic;
import Structure.Expression;
import Visitor.Visitor;

public class Atomic extends Expression {

	@Override
	public <T> void accept(Visitor<T> visitor) {
		visitor.visitAtomic(this);
	}

}
