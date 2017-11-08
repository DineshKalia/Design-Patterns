package Observer;

/*
 * Author: Dinesh Kalia
 * 
 * AccountObserver abstract class.
 */

public abstract class AccountObserver {
	
	protected AccountSubject subject;
	
	public abstract void update();
	
}
