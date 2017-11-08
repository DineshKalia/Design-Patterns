package Bridge;

/*
 * Author: Dinesh Kalia
 * 
 * Description: Bridge design is a structural pattern used when
 * decoupling an abstraction from its implementation by providing
 * bridging inbetween them. The interface acts as the bridge.
 */

public class Main {

	public static void main(String[] args) {
		
		//invoking square class through abstractshape.
		abstractShape square1 = new refinedShape(2, 2, 4, new square());
		
		//invoking rectangle class through abstractshape.
		abstractShape rectangle1 = new refinedShape(3, 3, 9, new rectangle());
		
		square1.draw();
		System.out.println("");
		rectangle1.draw();
	}

}
