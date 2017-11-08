package Visitor;

/*
 * Author: Dinesh Kalia
 * 
 * Implementing adult account with a balance.
 */

public class AdultAccount implements AccountVisitable {
	private double balance;

	public AdultAccount(double balance) {
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
