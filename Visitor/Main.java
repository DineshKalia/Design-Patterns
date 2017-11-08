package Visitor;

/*
 * Author: Dinesh Kalia
 * 
 * Description: Visitor design is a behavioral pattern
 * that uses visitor class to change executing algorithm. 
 */

public class Main {

	public static void main(String[] args) {
	
		//make a visitor object
		AccountVisitor account = new AccountVisitor();
		
		//make 3 different accounts.
		StudentAccount studentAccount = new StudentAccount(100);
		AdultAccount adultAccount = new AdultAccount(300);
		SeniorAccount seniorAccount = new SeniorAccount(700);
		
		//visit each account and make fee charges.
		System.out.println("Student account balance: 100 \n" + studentAccount.accept(account));
		System.out.println("Adult account balance: 300 \n" + adultAccount.accept(account));
		System.out.println("Senior account balance: 700 \n" + seniorAccount.accept(account));
	}

}
