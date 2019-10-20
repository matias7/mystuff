package parts;

public class EngineV10 extends EngineAbstract implements Engine {

	@Override
	public int getShifts() {
		return 6;
	}

	@Override
	public int getMaxVelocity() {
		return 298;
	}

	@Override
	public int getWeight() {
		return 850;
	}

}
