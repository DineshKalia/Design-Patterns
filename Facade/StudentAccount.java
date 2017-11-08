package Facade;

/*
 * Author: Dinesh Kalia
 * 
 * making StudentAccount.
 */

public class StudentAccount implements Account {

	@Override
	public void make() {
		System.out.println("Student Account Made!");
	}

}
