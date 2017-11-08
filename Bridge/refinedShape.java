package Bridge;

/*
 * Author: Dinesh Kalia
 * 
 * Implementation of abstractShape and use 
 * shapeinterface object for the bridge.
 */

public class refinedShape extends abstractShape {

	private int length, width, area;
	public refinedShape(int length, int width, int area, shapeInterface shape1) {
		super(shape1);
		this.area = area;
		this.length = length;
		this.width = width;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		shape1.dimensions(length, width, area);
	}

}
