package State;

/*
 * Author: Dinesh Kalia
 * 
 * Description: State design is a behavioral pattern
 * that is used when behavior of an object changes based on
 * its state.
 */

public class Main {

	public static void main(String[] args) {
		
		//context object carries account state.
		AccountContext accountContext = new AccountContext();
		
		//make an openstate account. Context carries the state.
		OpenAccount openstate = new OpenAccount();
		openstate.state(accountContext);
		
		System.out.println(accountContext.getState().toString());
		
		//make an lockedstate account. Context carries the state.
		LockedAccount lockedstate = new LockedAccount();
		lockedstate.state(accountContext);
		
		System.out.println(accountContext.getState().toString());
	}

}
