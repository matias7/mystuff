package main;

import car.Vehiculo;
import factories.*;

public class Main {
	
	public static void main(String[] args) 
	{
		VehiculoFactory vehicleFactory = new VehiculoFactory();
		EngineFactory engineFactory = new EngineFactory();
		Vehiculo eSedan = vehicleFactory.getVehiculoSedan(engineFactory.getElectricEngine());
		Vehiculo deportivo = vehicleFactory.getVehiculoDeportivo(engineFactory.getEngineV8());
		System.out.println("Top Speed of deportive car: "+deportivo.getMaxVelocity());
		System.out.println("Electric Sedan top speed: "+eSedan.getMaxVelocity());
	}

}
