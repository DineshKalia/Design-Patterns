package Proxy;

/*
 * Author: Dinesh Kalia
 * 
 * Creating real account.
 */

public class RealAccount implements AccountInterface {

	private String name;
	
	public RealAccount(String name) {
		this.name = name;
		System.out.println("Real account with name: " + this.name);
	}

	@Override
	public void show() {

		System.out.println("Showing real account of " + this.name);
	}

}
