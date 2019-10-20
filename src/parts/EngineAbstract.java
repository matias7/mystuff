package parts;

public abstract class EngineAbstract implements Engine {
	protected boolean started = false;
	
	@Override
	public void start() {
		this.started = true;
	}
	@Override
	public void stop() {
		this.started = false;
	}
	
	public boolean isOn()
	{
		return this.started;
	}
	
}
