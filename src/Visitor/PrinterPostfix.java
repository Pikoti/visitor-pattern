package Visitor;

import Structure.Environment;
import Structure.binary.Binary;

public class PrinterPostfix extends Printer{

		@Override
		public String visitBinary(Binary binary,Environment en) {
			return "(" + binary.getOperand1().toString() + binary.getOperand2().toString() + binary.getOperator() + ")";
		}
}
