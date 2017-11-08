package Proxy;

/*
 * Author: Dinesh Kalia
 * 
 * Description: 
 */

public class Main {

	public static void main(String[] args) {
		
		//getting real account using proxy
		AccountInterface john = new ProxyAccount("John");
		
		john.show();
	}

}
