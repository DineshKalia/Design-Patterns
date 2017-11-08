package Command;

/*
 * Author: Dinesh Kalia
 * 
 * Add class responsible for computing.
 */

public class Add {

	private int number;

	public Add(int number) {
		this.number = number;
	}
	
	public int compute(int input){
		return input+number;
	}
	
}
