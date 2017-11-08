package ChainOfResponsibility;

/*
 * Author: Dinesh Kalia
 * 
 * Description: Chain of Responsibility is a behavioral pattern
 * that sends user input from one class to the next until its resolved.
 */

public class Main {

	public static void main(String[] args) {
		ChainHandler positive = new Positive();
		ChainHandler negative = new Negative();
		
		// create chain link.
		negative.nextChain(positive);
		
		System.out.println("Chain order: check negative then positive.");
		
		// send input to first link, Negative class.
		System.out.println("Input: 7");
		negative.inputHandler(7);
		
		System.out.println("Input: -4");
		negative.inputHandler(-4);
		
		System.out.println("Input: 0");
		negative.inputHandler(0);
	}

}
