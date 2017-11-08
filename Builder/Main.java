package Builder;

/*
 * Author: Dinesh Kalia
 * 
 * Description: Builder design is a creational pattern
 * that builds a complex object using simple objects.
 */

public class Main {

	public static void main(String[] args) {
		
		//get carFactory of type carFactoryInterface.
		carFactoryInterface carfactory = new carFactory();
		
		//send specifications to the factory.
		carDirector cardirector = new carDirector(carfactory);
		
		//make the car
		cardirector.makeCar();
		
		//returns the car with appropriate parts.
		Car firstCar = cardirector.getCar();
		
		//show that car is built.
		System.out.println("Car is built!");
		System.out.println("Car body type: " + firstCar.getCarBody());
		System.out.println("Car wheels type: " + firstCar.getCarWheels());
		System.out.println("Car color type: " + firstCar.getCarColor());
		System.out.println("Car model year: " + firstCar.getCarDesignYear());
	}

}
