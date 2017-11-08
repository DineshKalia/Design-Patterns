package Builder;

/*
 * Author: Dinesh Kalia
 * 
 * A simple car interface that will be
 * returned from the builder.
 */

public interface carInterface {
	public void setCarBody(String body);
	public void setCarWheels(String wheels);
	public void setCarColor(String color);
	public void setCarDesignYear(String year);
}
