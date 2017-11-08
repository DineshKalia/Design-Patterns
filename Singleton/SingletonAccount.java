package Singleton;

/*
 * Author: Dinesh Kalia
 * 
 * SingletonAccount only allows single object to be
 * instantiated. 
 */

public class SingletonAccount {
	
	//make singleton account.
	private static SingletonAccount account = new SingletonAccount();
	
	//private class to prevent instantiation.
	private SingletonAccount(){	}
	
	//the only account available
	public static SingletonAccount getInstance(){
		return account;
	}
	
	public void toStringAccount(){
		System.out.println("Single object created and accessed directly.");
	}
}
