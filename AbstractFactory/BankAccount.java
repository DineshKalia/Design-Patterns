package AbstractFactory;

/*
 * Author: Dinesh Kalia
 * Implementing bank account super factory.
 */

public class BankAccount implements BankAccountInterface {

	//making student account factory. 
	@Override
	public StudentAccountInterface makeStudentAccount() {
		System.out.println("returns student account instance.");
		return new StudentAccount();
	}

	//making adult account factory.
	@Override
	public AdultAccountInterface makeAdultAccount() {
		System.out.println("returns adult account instance.");
		return new AdultAccount();
	}
	
}
