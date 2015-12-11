package Run;

import java.util.HashMap;

public class Environment {
	protected HashMap<Variable,Value> env;
	
	public Environment(){
		env = new HashMap<Variable,Value>();
	}
	
	public void setValue(Variable variable, Value value) {
		env.put(variable,value);
	}
	
	public Value getValue(Variable variable) throws UnboundVariableException{
		if (!env.containsKey(variable)) throw new UnboundVariableException();
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
