package Observer;

/*
 * Author: Dinesh Kalia
 * 
 * YAccountObserver used to make yaccount object
 * and get its current status.
 */

public class YAccountObserver extends AccountObserver {

	public YAccountObserver(AccountSubject subject) {

		this.subject = subject;
		this.subject.add(this);
	}
	
	@Override
	public void update() {

		System.out.println("Y account: " + subject.getStatus());
	}

}
