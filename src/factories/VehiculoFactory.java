package factories;

import car.Vehiculo;
import car.VehiculoDeportivo;
import car.VehiculoSedan;
import parts.Engine;

public class VehiculoFactory {
	
	public VehiculoFactory() {
		
	}
	
	public Vehiculo getVehiculoSedan(Engine engine)
	{
		return new VehiculoSedan(engine);
	}
	
	public Vehiculo getVehiculoDeportivo(Engine engine)
	{
		return new VehiculoDeportivo(engine);
	}
	
}
