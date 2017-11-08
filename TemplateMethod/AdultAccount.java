package TemplateMethod;

/*
 * Author: Dinesh Kalia
 * 
 * AdultAccount implements template features
 * specified in abstract class.
 */

public class AdultAccount extends AbstractAccountTemplate {

	@Override
	void setupBalance() {
		
		System.out.println("Adult Balance feature created.");
	}

	@Override
	void setupDeposit() {
	
		System.out.println("Adult Deposit feature created.");
	}

	@Override
	void setupWithdraw() {
		
		System.out.println("Adult Withdraw feature created.");
	}


}
