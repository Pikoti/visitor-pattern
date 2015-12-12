package Visitor;

import Structure.binary.Binary;

public class PrinterInfix extends Printer {
	
		@Override
		public String visitBinary(Binary binary) {
			return "(" + binary.getOperand1().toString() + "+" + binary.getOperand2().toString() + ")";
		}
}
 

