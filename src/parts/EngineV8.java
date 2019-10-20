package parts;

public class EngineV8 extends EngineAbstract implements Engine {

	@Override
	public int getShifts() {
		return 5;
	}

	@Override
	public int getMaxVelocity() {
		return 227;
	}

	@Override
	public int getWeight() {
		return 950;
	}

}
