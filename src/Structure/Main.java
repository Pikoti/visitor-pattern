package Structure;

import Structure.atomic.Literal;
import Structure.atomic.Variable;
import Structure.binary.Plus;
import Visitor.Evaluator;
import Visitor.Printer;


public class Main {

	public static void main(String[] args) {
		   	Environment en = new Environment();
			Evaluator eval = new Evaluator();

			eval.setEnvironment(en);
			
			Printer p = new Printer();
			Literal one = new Literal(1);
	        Variable two = new Variable("X");
	        en.setValue(two, new Literal(2));
	       
	        Expression e = new Plus(one,two);
	        
	        System.out.println("e= "+ e.accept(p));
	        System.out.println(e.accept(eval));
	}
}
