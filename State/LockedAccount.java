package State;

/*
 * Author: Dinesh Kalia
 * 
 * Implementing possible account state: locked.
 */

public class LockedAccount implements AccountStateInterface {

	@Override
	public void state(AccountContext account) {
		
		account.setState(this);
	}
	
	public String toString(){
		return "Account state: Locked.";
	}

}
