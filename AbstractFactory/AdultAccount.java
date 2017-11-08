package AbstractFactory;

/*
 * Author: Dinesh Kalia
 * 
 * Actually making the adult account.
 */

public class AdultAccount implements AdultAccountInterface {

	@Override
	public void makeAccount() {
		System.out.println("adult account has made!");
	}

}
