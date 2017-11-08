package TemplateMethod;

/*
 * Author: Dinesh Kalia
 * 
 * StudentAccount implements template features
 * specified in abstract class.
 */

public class StudentAccount extends AbstractAccountTemplate {

	@Override
	void setupBalance() {
		
		System.out.println("Student Balance feature created.");
	}

	@Override
	void setupDeposit() {
	
		System.out.println("Student Deposit feature created.");
	}

	@Override
	void setupWithdraw() {
		
		System.out.println("Student Withdraw feature created.");
	}

	
	
}
