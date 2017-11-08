package Observer;
import java.util.*;

/*
 * Author: Dinesh Kalia
 * 
 * AccountSubject keeps the list of accounts
 * and updates theie status.
 */

public class AccountSubject {
	private List<AccountObserver> accountList = new ArrayList<AccountObserver>();
	private String status;

	//add accounts to collection.
	public void add(AccountObserver obs) {

		accountList.add(obs);
	}
	
	//update their status.
	public void setStatus(String status){
		this.status = status;
		for(AccountObserver account: accountList){
			account.update();
		}
	}
	
	public String getStatus(){
		return status;
	}
	
}
