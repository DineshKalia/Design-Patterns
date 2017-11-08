package Strategy;

/*
 * Author: Dinesh Kalia
 * 
 * Account action: withdraw.
 */

public class WithdrawStrategy implements AccountStrategyInterface {

	public int action(int balance, int number) {
	
		return balance - number;
	}

}
