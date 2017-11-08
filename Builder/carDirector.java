package Builder;

/*
 * Author: Dinesh Kalia
 * 
 * Build a car using the carFactoryInterface
 * object 
 */

public class carDirector {

	private carFactoryInterface factory;

	//specifications.
	public carDirector(carFactoryInterface factory) {
		this.factory = factory;
	}
	
	//return the specifications.
	public Car getCar(){
		
		return this.factory.getCar();
		
	}
	
	//executes methods specific to the carFactoryInterface.
	public void makeCar(){
		this.factory.buildCarBody();
		this.factory.buildCarColor();
		this.factory.buildCarWheels();
		this.factory.buildCarYear();
	}
}
