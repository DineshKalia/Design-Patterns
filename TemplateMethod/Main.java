package TemplateMethod;

/*
 * Author: Dinesh Kalia
 * 
 * Description: Template design is a behavioral pattern
 * that uses an abstract class which defines template of
 * methods but they can be overriden by subclasses. The 
 * instantiation needs to be the same. 
 */

public class Main {

	public static void main(String[] args) {
		
		//make student account based off abstract template
		AbstractAccountTemplate accountA = new StudentAccount();
		accountA.launch(); //implementing features.
		
		System.out.println();
		
		//make adult account based off abstract template
		AbstractAccountTemplate accountB = new AdultAccount();
		accountB.launch(); // implementing features
		
		
		
	}

}
