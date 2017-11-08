package ChainOfResponsibility;

/*
 * Author: Dinesh Kalia
 * 
 * Negative class inherits Chainhandler properties.
 * This class checks if user input is negative.
 * If it is, then recoganize it else send next in chain.
 */

public class Negative extends ChainHandler {

	@Override
	public void inputHandler(int input) {
		if (input < 0) {
			System.out.println("The number " + input + " is negative!");
			return;
		} else {
			System.out.println("Cannot determine passing to next in chain.");
			this.nextone.inputHandler(input);
		}
	}

}
