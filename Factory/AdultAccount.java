package Factory;

/*
 * Author: Dinesh Kalia
 * 
 * Make an adult account
 */

public class AdultAccount implements Account {

	@Override
	public void makeAccount() {
		System.out.println("Adult Account Made!");
	}

}
