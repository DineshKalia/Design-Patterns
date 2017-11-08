package Builder;

/*
 * Author: Dinesh Kalia
 * 
 * carFactory implements factory interface
 * and assembles the parts for the car.
 */

public class carFactory implements carFactoryInterface {

	private Car car1;
	
	
	public carFactory() {
		this.car1 = new Car();
	}

	@Override
	public void buildCarBody() {
		car1.setCarBody("Steel");
	}

	@Override
	public void buildCarWheels() {
		car1.setCarWheels("All season tires");
	}

	@Override
	public void buildCarColor() {
		car1.setCarColor("Silver");
	}

	@Override
	public void buildCarYear() {
		car1.setCarDesignYear("1969");
	}

	@Override
	public Car getCar() {
		return this.car1;
	}

}
