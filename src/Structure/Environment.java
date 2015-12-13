package Structure;

import java.util.HashMap;
import Structure.atomic.Literal;
import Structure.atomic.Variable;

public class Environment {
	protected HashMap<Variable,Literal> env;
	
	public Environment(){
		env = new HashMap<Variable,Literal>();
	}
	
	public void setValue(Variable variable, Literal value) {
		env.put(variable,value);
	}
	
	public Literal getValue(Variable variable) throws UnboundVariable{
		if (!env.containsKey(variable)) throw new UnboundVariable();
		return env.get(variable);
	}
	
	public Variable getVariable(String name) {
		for (Variable var : env.keySet()) {
			if (var.equals(name)) {
				return var;
			}
		}
		return null;
	}
}
