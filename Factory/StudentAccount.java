package Factory;

/*
 * Author: Dinesh Kalia
 * 
 * Make a student account.
 */

public class StudentAccount implements Account {

	@Override
	public void makeAccount() {
		System.out.println("Student Account made!");
	}

}
