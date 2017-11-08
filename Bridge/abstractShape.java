package Bridge;

/*
 * Author: Dinesh Kalia
 * 
 * An abstractShape class with partial
 * implementation.
 */

public abstract class abstractShape {
	
	//make "bridge" interface object.
	protected shapeInterface shape1;

	public abstractShape(shapeInterface shape1) {
		this.shape1 = shape1;
	}
	
	public abstract void draw();
}
