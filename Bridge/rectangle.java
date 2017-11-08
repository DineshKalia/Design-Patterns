package Bridge;

/*
 * Author: Dinesh Kalia
 * 
 * Implementing the shapeInterface.
 */

public class rectangle implements shapeInterface {

	@Override
	public void dimensions(int length, int width, int area) {
		System.out.printf("Rectangle dimensions: length of %d, width of %d and area of %d.", length, width, area);
	}

}
