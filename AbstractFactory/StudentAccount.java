package AbstractFactory;

/*
 * Author: Dinesh Kalia
 * 
 * Actually making student account.
 */

public class StudentAccount implements StudentAccountInterface {

	@Override
	public void makeAccount() {
		System.out.println("student account made!");
	}

}
