package Singleton;

/*
 * Author: Dinesh Kalia
 * 
 * Description: Singleton design is creational pattern
 * that is used to make sure only single object is created.
 */

public class Main {

	public static void main(String[] args) {
		//can only access single account object.s
		SingletonAccount account = SingletonAccount.getInstance();
		account.toStringAccount();
	}

}
