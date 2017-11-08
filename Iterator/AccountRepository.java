package Iterator;

/*
 * Author: Dinesh Kalia
 * 
 * The AccountRepository class keeps a collection of accounts.
 * The inner class implements the iterator interface.
 */

public class AccountRepository implements AccountRepositoryInterface {

	//collection of accounts.
	public String accountList[] = {"John account","Alex account", "Ronald account", "Ray account"};
	
	@Override
	public IteratorInterface getIterator() {

		return new Iterator();
	}	
	
	//inner class
	public class Iterator implements IteratorInterface{
		public int count;
		
		@Override
		//check if collection hasNext, if it does then move forward 1 index.
		public Object next() {

			if(this.hasNext()){
				return accountList[count++];
			}
			return null;
		}
	
		
		@Override
		//checking if reached end of collection.
		public boolean hasNext() {

			if(count < accountList.length){
				return true;
			}
			return false;
		}
	}
}
