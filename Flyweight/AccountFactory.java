package Flyweight;
import java.util.HashMap;

/*
 * Author: Dinesh Kalia
 * 
 * AccountFactory gets the user request to use
 * an account with specific name. It checks if
 * an account already exists in the HashMap by that
 * name. If it does, it returns to user that it already exists.
 * If it does not, then make a new one by providing student number.
 */

public class AccountFactory {
	
	//stores existing accounts.
	private static final HashMap<String, AccountInterface> accountInfo = new HashMap<>();
	
	public static AccountInterface getAccount(String input){
		
		//check if account already exists.
		StudentAccount account = (StudentAccount) accountInfo.get(input);
		
		//doesnt exist so make new.
		if(account == null){
			System.out.println("Could not find account in database, so creating new one!");
			account = new StudentAccount(input);
			accountInfo.put(input, account);
			System.out.println("Account successfully added!");
		}else{
			//found in database.
			System.out.println("Found in database! Name " + input + " with student number " + account.getStudentNumber());
		}
		return account;
		
	}
}
