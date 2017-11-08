package ChainOfResponsibility;

/*
 * Author: Dinesh Kalia
 * 
 * An abstract ChanHandler class.
 */

public abstract class ChainHandler {
	
	protected ChainHandler nextone;

	//handles user input
	public abstract void inputHandler(int input);
	
	// holds next class in chain.
	public void nextChain(ChainHandler handler){
		this.nextone = handler;
	}
}
