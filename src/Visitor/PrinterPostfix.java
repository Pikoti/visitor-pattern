package Visitor;

import Structure.binary.Binary;

public class PrinterPostfix extends Printer{

		@Override
		public String visitBinary(Binary binary) {
			return "(" + binary.getOperand1().toString() + binary.getOperand2().toString() + binary.getOperator() + ")";
		}
}
