package State;

/*
 * Author: Dinesh Kalia
 * 
 * Implementing possible account state: open.
 */

public class OpenAccount implements AccountStateInterface {

	@Override
	public void state(AccountContext account) {
	
		account.setState(this);
	}
	
	public String toString(){
		return "Account state: Open.";
	}

}
