package Proxy;

/*
 * Author: Dinesh Kalia
 * 
 * ProxyAccount uses realAccount object to get access.
 */

public class ProxyAccount implements AccountInterface {

	private RealAccount realAccount;
	private String name;
	
	public ProxyAccount(String name) {
		this.name = name;
	}

	@Override
	public void show() {

		if(realAccount == null){
			realAccount = new RealAccount(name);
		}
		realAccount.show();
	}

}
