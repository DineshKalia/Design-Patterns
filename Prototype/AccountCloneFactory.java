package Prototype;

/*
 * Author: Dinesh Kalia
 * 
 * AccountCloneFactory making clone of current account.
 */

public class AccountCloneFactory {
	
	public AccountInterface getClone(AccountInterface account){
		return account.makeCopy();
	}

}
