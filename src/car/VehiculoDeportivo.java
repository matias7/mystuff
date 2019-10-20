package car;

import parts.Engine;

public class VehiculoDeportivo extends VehiculoAbstract implements Vehiculo {

	public VehiculoDeportivo(Engine engine) {
		this.engine = engine;
	}
	@Override
	public int getShifts() {
		// TODO Auto-generated method stub
		return 6;
	}

}
