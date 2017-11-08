package AbstractFactory;

/*
 * Author: Dinesh Kalia
 * Super-factory producer interface.
 * it makes student and adult account factory.
 */

public interface BankAccountInterface {
	public StudentAccountInterface makeStudentAccount();
	public AdultAccountInterface makeAdultAccount();
	
}
