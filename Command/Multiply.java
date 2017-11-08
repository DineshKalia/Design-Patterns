package Command;

/*
 * Author: Dinesh Kalia
 * 
 * Multiply Class responsible for computing.
 */

public class Multiply {

	private int multi;

	public Multiply(int multi) {
		this.multi = multi;
	}
	
	public int compute(int input){
		return input*multi;
		
	}
}
