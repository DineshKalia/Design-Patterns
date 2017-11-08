package Visitor;

/*
 * Author: Dinesh Kalia
 * 
 * Account interface used to visit each type
 * of account.
 */

public interface AccountInterface {
	public double visit(StudentAccount studentAccount);
	public double visit(AdultAccount adultAccount);
	public double visit(SeniorAccount seniorAccount);
	
}
