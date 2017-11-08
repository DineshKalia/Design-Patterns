package Facade;

/*
 * Author: Dinesh Kalia
 * 
 * Description: Facade design is a structural pattern
 * that hides system complexities and provides user with
 * interface to access the system. It involves interacting
 * with simple class that sends calls to existing classes and
 * their methods.
 */

public class Main {

	public static void main(String[] args) {
		
		//user only interacts with AccountManager. 
		AccountManager account = new AccountManager();
		
		//AccountManager then sends calls to methods of existing classes.
		//making the classes.
		account.getStudentAccount();
		account.getAdultAccount();
		account.getSeniorAccount();
		
	}

}
