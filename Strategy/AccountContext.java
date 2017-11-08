package Strategy;

/*
 * Author: Dinesh Kalia
 * 
 * This class checks the context of the request at
 * run-time (deposit or withdarw) and makes appropriate
 * call to a strategy.
 */

public class AccountContext {

	private AccountStrategyInterface strategy;

	public AccountContext(AccountStrategyInterface strategy) {
		this.strategy = strategy;
	}
	
	public int chooseStrategy(int balance, int number){
		return strategy.action(balance, number);
	}
	
}
