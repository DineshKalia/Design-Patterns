package Factory;

/*
 * Author: Dinesh Kalia
 * 
 * This is a common interface user 
 * interacts with.
 */

public class AccountFactory {
	
	//get user request.
	public Account getAccount(String input){
		

		if(input == null){
			return null;
		}
		//check what user requested for.
		if(input.toLowerCase() == "student"){
			return new StudentAccount();
		}else if (input.toLowerCase() == "adult"){
			return new AdultAccount();
		} else {
			System.out.println("Invaild Input");
			return null;
		}
	}
}
