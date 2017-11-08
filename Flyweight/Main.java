package Flyweight;

/*
 * Author: Dinesh Kalia
 * 
 * Description: Flyweight design is structural pattern
 * used to reduce number of objects created and to lower 
 * memory usage. This pattern reuse already existing similar
 * object by storing them and create new object if no matching object
 * is found.
 */

public class Main {

	public static void main(String[] args) {
		
		//get a student account. if it doesnt exist make new, else reuse.
		StudentAccount stuAccount = (StudentAccount) AccountFactory.getAccount("Bob");
		stuAccount.setStudentNumber(123);
		stuAccount.makeAccount();	
		System.out.println("\n");
		
		StudentAccount stuAccount1 = (StudentAccount) AccountFactory.getAccount("John");
		stuAccount1.setStudentNumber(999);
		stuAccount1.makeAccount();	
		System.out.println("\n");
		
		@SuppressWarnings("unused")
		//account already exists!
		StudentAccount stuAccount2 = (StudentAccount) AccountFactory.getAccount("Bob");
	}

}
