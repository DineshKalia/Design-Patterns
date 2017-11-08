package Visitor;

/*
 * Author: Dinesh Kalia
 * 
 * Implementing student account with a balance.
 */

public class StudentAccount implements AccountVisitable {

	private double balance;

	public StudentAccount(double balance) {
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
