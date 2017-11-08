package Decorator;

/*
 * Author: Dinesh Kalia
 * 
 * This class gives new feature to shape 
 * class, color!
 */

public class ShapeDecro extends AbstractShapeDecro {

	public ShapeDecro(ShapeInterface shape) {
		super(shape);

	}
	
	@Override 
	public void drawShape(){
		shape.drawShape();
		color(shape);
	}

	private void color(ShapeInterface shape) {
		System.out.println("color: Silver");
	}

}
