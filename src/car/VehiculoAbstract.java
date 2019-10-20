package car;

import parts.Engine;

public abstract class VehiculoAbstract implements Vehiculo {

	protected boolean started = false;
	protected Engine engine;
		
	@Override
	public void start() {
		this.engine.start();
	}

	@Override
	public void stop() {
		this.engine.stop();
	}

	@Override
	public boolean isOn() {
		return this.engine.isOn();
	}
	
	@Override
	public int getShifts() {
		// TODO Auto-generated method stub
		return this.engine.getShifts();
	}
	
	@Override
	public int getMaxVelocity() {
		return this.engine.getMaxVelocity();
	}
	
	@Override
	public int getWeight() {
		return this.engine.getWeight();
	}
}
