package Decorator;

/*
 * Author: Dinesh Kalia
 * 
 * An abstract decorator class that wraps
 * around shape interface providing additional
 * functionality.
 */

public abstract class AbstractShapeDecro implements ShapeInterface {

	//create shape object to give it additional functionality.
	protected ShapeInterface shape;

	public AbstractShapeDecro(ShapeInterface shape) {
		this.shape = shape;
	}
	
	public void drawShape(){
		shape.drawShape();
	}
}
