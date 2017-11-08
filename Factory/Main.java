package Factory;

/*
 * Author: Dinesh Kalia
 * 
 * Description: Factory design is a creational pattern
 * that create object without showing logic to the user.
 * The newly created object is known as common interface. 
 */

public class Main {

	public static void main(String[] args) {
		
		//made common AccountFactory interface.
		AccountFactory request = new AccountFactory();
		
		//requesting to make adult account without showing logic.
		Account account = request.getAccount("adult");
		account.makeAccount();
		
		Account account1 = request.getAccount("student");
		account1.makeAccount();
	}

}
