package Iterator;

/*
 * Author: Dinesh Kalia
 * 
 * Description: Iterator design is a behavioral pattern
 * used to get a way to access elements of a collection in
 * a sequential manner.
 */

public class Main {

	public static void main(String[] args) {
		
		//make AccountRepository object.
		AccountRepository account = new AccountRepository();
		
		// iterate over the collection in account object.
		for(IteratorInterface i = account.getIterator(); i.hasNext();){
			String accountName = (String) i.next();
			System.out.println(accountName);
		}
		
	}

}
