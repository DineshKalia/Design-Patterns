package Strategy;

/*
 * Author: Dinesh Kalia
 * 
 * Description: Strategy design is a behavioral pattern
 * that is used when class behavior needs to be determined
 * at run-time.
 */

public class Main {

	public static void main(String[] args) {
		
		//account object created. but action to be performed is done at run-time (deposit)
		AccountContext account = new AccountContext(new DepositStrategy());
		System.out.println("Account Balance: 100 \nDeposit -> $25");
		System.out.println("New balance: " + account.chooseStrategy(100, 25) + "\n");
		
		//account object created. but action to be performed is done at run-time (withdraw)
		account = new AccountContext(new WithdrawStrategy());
		System.out.println("Account Balance: 200 \nDeposit -> $50");
		System.out.println("New balance: " + account.chooseStrategy(200, 50) + "\n");
	}

}
