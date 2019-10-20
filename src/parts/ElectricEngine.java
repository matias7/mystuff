package parts;

public class ElectricEngine extends EngineAbstract implements Engine {

	@Override
	public int getShifts() {
		return 1;
	}

	@Override
	public int getMaxVelocity() {
		return 180;
	}

	@Override
	public int getWeight() {
		return 950;
	}

}
