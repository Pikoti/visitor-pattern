package Structure.atomic;
import Structure.Environment;
import Structure.Expression;
import Visitor.Visitor;

public class Atomic extends Expression {

	@Override
	public <T> void accept(Visitor<T> visitor,Environment en) {
		visitor.visitAtomic(this,en);
	}

}
