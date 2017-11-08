package Composite;

/*
 * Author: Dinesh Kalia
 * 
 * This class represents leafs that have no
 * children.
 */

public class Movie extends MovieComponent {

	public Movie(int number, MovieComponent parent){
		this.number = number;
		this.parent = parent;
	}
	
	public int getSum(){
		return number;
	}


}
