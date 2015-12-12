package Structure.atomic;

public class Variable extends Atomic {

	protected String name;
	
	public Variable(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String print() {
		return name;
	}
}
