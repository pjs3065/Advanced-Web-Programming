package myPackage;

import java.util.*;

public class StateLookup {
	
	private Map<String,StatePair> states;
	
	public StateLookup()
	{
		states = new HashMap<String, StatePair>();
		addState(new StatePair("california", "CA"));
	}
	
	public StatePair findState(String stateName)
	{
		if(stateName != null)
		{
			return(states.get(stateName.toLowerCase()));
		}
		return null;
	}
	
	private void addState(StatePair stateInfo) {
		states.put(stateInfo.getStateName(), stateInfo);
	}

}
