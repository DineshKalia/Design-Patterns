package State;

/*
 * Author: Dinesh Kalia
 * 
 * AccountContext will carry the state.
 */

public class AccountContext {

	private AccountStateInterface state;
	
	
	public AccountContext() {
		state = null;
	}

	public void setState(AccountStateInterface accountState) {
		
		this.state = accountState;
	}
	
	public AccountStateInterface getState(){
		return state;
	}

}
