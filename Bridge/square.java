package Bridge;

/*
 * Author: Dinesh Kalia
 * 
 * Implementing the shape Interface
 */

public class square implements shapeInterface {

	@Override
	public void dimensions(int length, int width, int area) {
		System.out.printf("Square dimensions: length of %d, width of %d and area of %d.", length, width, area);
	}

}
