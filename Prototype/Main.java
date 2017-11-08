package Prototype;

/*
 * Author: Dinesh Kalia
 * 
 * Description: Prototype design is a creational pattern
 * that is used to created duplicate object. The user tells
 * prototype interface to create clone of current object.
 */

public class Main {

	public static void main(String[] args) {
		
		//make cloning factory.
		AccountCloneFactory accountCloner = new AccountCloneFactory();
		
		//make account john.
		StudentAccount john = new StudentAccount();
		
		//use clone factory to clone account john
		StudentAccount clonedAccount = (StudentAccount) accountCloner.getClone(john);
		
		//show memory address of original john account and its clone.
		System.out.println(john + " (original) memory address is  " + System.identityHashCode(john));
		System.out.println(clonedAccount + " (cloned) memory address is  " + System.identityHashCode(clonedAccount));
		
	}

}
