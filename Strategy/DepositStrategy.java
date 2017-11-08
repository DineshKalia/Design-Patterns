package Strategy;

/*
 * Author: Dinesh Kalia
 * 
 * Account action: deposit.
 */

public class DepositStrategy implements AccountStrategyInterface {

	
	public int action(int balance, int number) {
		
		return balance + number;
	}

}
