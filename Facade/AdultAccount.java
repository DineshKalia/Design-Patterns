package Facade;

/*
 * Author: Dinesh Kalia
 * 
 * making an AdultAccount
 */

public class AdultAccount implements Account {

	@Override
	public void make() {
		System.out.println("Adult Account Made!");
	}

}
