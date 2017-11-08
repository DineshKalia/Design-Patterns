package Decorator;

/*
 * Author: Dinesh Kalia
 * 
 * Description: Decorator design is a structural pattern
 * that allows new functionality to be added to an existing 
 * object. The decorator class (new functionality) wraps the
 * original class and provides additional functionality.
 */

public class Main {

	public static void main(String[] args) {	
		
		//make square shape. (original class)
		ShapeInterface square = new Square();
		
		//color it silver. (decorator class)
		ShapeInterface coloredsquare = new ShapeDecro(square);
		
		//make diamond shape
		ShapeInterface diamond = new Diamond();
		
		//color it silver
		ShapeInterface coloreddiamond = new ShapeDecro(diamond);
		
		//make polygon shape
		ShapeInterface polygon = new Polygon();
		
		//color it silver
		ShapeInterface coloredpolygon = new ShapeDecro(polygon);
		
		//print out the shapes!
		System.out.println("Shapes available: ");
		square.drawShape();
		diamond.drawShape();
		polygon.drawShape();
		
		System.out.println("\nNow decorate them!");
		
		//print out the colors!
		coloredsquare.drawShape();
		coloreddiamond.drawShape();
		coloredpolygon.drawShape();
	}

}
