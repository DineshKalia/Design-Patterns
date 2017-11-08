package Builder;

/*
 * Author: Dinesh Kalia
 * 
 * car class implementing carInterface.
 * returns car parts.
 */

public class Car implements carInterface {

	private String carbody;
	private String carwheel;
	private String carcolor;
	private String caryear;
	
	@Override
	public void setCarBody(String body) {
		carbody = body;
	}

	public String getCarBody(){
		return carbody;
	}
	
	@Override
	public void setCarWheels(String wheels) {
		carwheel = wheels;
	}

	public String getCarWheels(){
		return carwheel;
	}
	
	@Override
	public void setCarColor(String color) {
		carcolor = color;
	}

	public String getCarColor(){
		return carcolor;
	}
	
	@Override
	public void setCarDesignYear(String year) {
		caryear = year;
	}
	
	public String getCarDesignYear(){
		return caryear;
	}

}
