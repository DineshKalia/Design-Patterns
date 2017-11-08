package Visitor;

/*
 * Author: Dinesh Kalia
 * 
 * Implementing senior account with a balance.
 */

public class SeniorAccount implements AccountVisitable {

	private double balance;

	public SeniorAccount(double balance) {
		this.balance = balance;
	}
	
	public double getBalance(){
		return balance;
	}

	//accept this visitor
	@Override
	public double accept(AccountVisitor accountVisitor) {
		
		return accountVisitor.visit(this);
	}
}
