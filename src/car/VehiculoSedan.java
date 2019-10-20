package car;

import parts.Engine;

public class VehiculoSedan extends VehiculoAbstract implements Vehiculo {
	
	public VehiculoSedan(Engine engine) {
		this.engine = engine;
	}
}
