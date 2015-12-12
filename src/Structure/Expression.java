package Structure;

import Visitor.Printer;
import Visitor.Visitor;

public abstract class Expression {

	public abstract <T> void accept(Visitor<T> visitor);
	
	public String print(Printer printer) {
		return "";
	}
}
