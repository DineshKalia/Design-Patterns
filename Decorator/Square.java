package Decorator;

/*
 * Author: Dinesh Kalia
 * 
 * Making a square shape (original class)
 */

public class Square implements ShapeInterface {

	@Override
	public void drawShape() {
		System.out.println("Square Shape!");
	}

}
