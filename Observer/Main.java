package Observer;

/*
 * Author: Dinesh Kalia
 * 
 * Description: Observer design is a behavioral pattern
 * that is used in one-to-many relationship between objects.
 * If object is modified, then all its dependents need to be
 * notified.
 */

public class Main {
	
	//make account objects. Change status of all account object with 1 instruction.
	public static void main(String args[]){
		
		//using AccountSubject and AccountObserver objects
		AccountSubject account = new AccountSubject();
		new YAccountObserver(account);
		new XAccountObserver(account);
		
		System.out.println("All account status changed to adult.");
		account.setStatus("Adult");
		
		System.out.println("All account status changed to student.");
		account.setStatus("Student");
		
	}

	
}
