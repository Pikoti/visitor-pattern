package Structure;

import Structure.atomic.Literal;
import Structure.binary.Plus;
import Visitor.Evaluator;


public class Main {

	public static void main(String[] args) {
		   	Environment en = new Environment();
			Evaluator eval = new Evaluator();
		   	
			Literal one = new Literal(1);
	        Literal two = new Literal(2);
	        Expression e = new Plus(one,two);

	}
}
