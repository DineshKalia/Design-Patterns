package Builder;

/*
 * Author: Dinesh Kalia
 * 
 * CarFactoryInterface defines methods
 * needed to build a car.
 */

public interface carFactoryInterface {
	public void buildCarBody();
	public void buildCarWheels();
	public void buildCarColor();
	public void buildCarYear();
	public Car getCar();
}
