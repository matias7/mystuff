package factories;

import parts.*;

public class EngineFactory {
	
	public Engine getEngineV8()
	{
		return new EngineV8();
	}
	
	public Engine getEngineV10()
	{
		return new EngineV10();
	}
	
	public Engine getElectricEngine()
	{
		return new ElectricEngine();
	}
}
