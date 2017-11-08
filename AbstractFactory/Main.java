package AbstractFactory;

/*
 * Author: Dinesh Kalia
 * 
 * Description: Abstract factory is creational pattern that
 * works by a super-factory creating other factories.
 * factory of factory then create the product. 
 */

public class Main {
	public static void main(String args[]){
		
		System.out.println("Creating a bank account.");
		BankAccountInterface bankAccount1 = new BankAccount();
		
		System.out.println("Creating a student account.");
		StudentAccountInterface studentAccount1 = bankAccount1.makeStudentAccount();
		
		System.out.println("Creating a adult account.");
		AdultAccountInterface adultAccount1 = bankAccount1.makeAdultAccount();
		
		System.out.printf("Student account feature: ");
		studentAccount1.makeAccount();
		
		System.out.printf("Adult account feature: ");
		adultAccount1.makeAccount();
		
	}

}
