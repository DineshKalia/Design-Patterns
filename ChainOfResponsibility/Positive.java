package ChainOfResponsibility;

/*
 * Author: Dinesh Kalia
 * 
 * Positive class inherits ChainHandler.
 * This class recives input from Negative class (chain)
 * and checks if user input is positive.
 * If it is, then recoganize it else invalid input.
 */

public class Positive extends ChainHandler {

	@Override
	public void inputHandler(int input) {
		if (input > 0) {
			System.out.println("The number " + input + " is positive!");
			return;
		} else {
			//this is end of chain.
			System.out.println("Checked all the chains! invalid input. ie 0, $, % etc.");
		}
	}

}
