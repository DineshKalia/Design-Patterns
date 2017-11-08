package Observer;

/*
 * Author: Dinesh Kalia
 * 
 * XAccountObserver used to make xaccount object
 * and get its current status.
 */

public class XAccountObserver extends AccountObserver {

	public XAccountObserver(AccountSubject subject) {

		this.subject = subject;
		this.subject.add(this);
	} 
	
	@Override
	public void update() {

		System.out.println("X account: " + subject.getStatus());
	}
}
