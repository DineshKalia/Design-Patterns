package Facade;

/*
 * Author: Dinesh Kalia
 * 
 * AccountManager interacts with the user to 
 * make appropriate accounts.
 */

public class AccountManager {

	//make all 3 types of accounts.
	private Account studentAccount;
	private Account adultAccount;
	private Account seniorAccount;
	
	public AccountManager() {
		studentAccount = new StudentAccount();
		adultAccount = new AdultAccount();
		seniorAccount = new SeniorAccount();
	}
	
	//calling existing classes that make the account.
	public void getStudentAccount(){
		studentAccount.make();
	}
	
	public void getAdultAccount(){
		adultAccount.make();
	}
	
	public void getSeniorAccount(){
		seniorAccount.make();
	}
	
}
