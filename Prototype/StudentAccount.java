package Prototype;

/*
 * Author: Dinesh Kalia
 * 
 * Creating student account.
 */

public class StudentAccount implements AccountInterface {

	public StudentAccount() {

		System.out.println("Original Student account made.");
	}
	
	@Override
	public AccountInterface makeCopy() {

		System.out.println("Cloned Student account is made!");
		
		StudentAccount account = null;
		
		//throw exception if current object cannot be cloned.
		try {
			account = (StudentAccount) super.clone();
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
		
		return account;
		
	}
	
	public String toString(){
		return "Student Account";
	}

}
