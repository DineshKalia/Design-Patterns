package Visitor;

/*
 * Author: Dinesh Kalia
 * 
 * Implementing the fee changes. 
 */

public class AccountVisitor implements AccountInterface {
		
	@Override
	public double visit(StudentAccount studentAccount) {
		System.out.println("Student account fee: $5");
		return studentAccount.getBalance() - 5;
	}

	@Override
	public double visit(AdultAccount adultAccount) {
		System.out.println("Adult account fee: $10");
		return adultAccount.getBalance() - 10;
	}

	@Override
	public double visit(SeniorAccount seniorAccount) {
		System.out.println("Senior account fee: $7");
		return seniorAccount.getBalance() - 7;
	}

}
