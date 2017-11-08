package Memento;

/*
 * Author: Dinesh Kalia
 * 
 * Description: Memento design is a behavioral pattern
 * used to restore state of an object to a previous state.
 */

public class Main {
	
	public static void main(String[] args) {

		//make an account
		AccountStatus accountStatus = new AccountStatus();
		
		//keep a tracker that stores account status
		Tracker trackerList = new Tracker();
		
		//mark account as student.
		accountStatus.setStatus("Student");
		
		//append current status to tracker.
		trackerList.addStatus(accountStatus.saveStatus());
		//change status to adult.
		accountStatus.setStatus("Adult");
		
		trackerList.addStatus(accountStatus.saveStatus());
		accountStatus.setStatus("Senior");
		
		
		System.out.println("Current status: " + accountStatus.getStatus());
		System.out.println("Previous status: " + trackerList.getIndex(1).getStatus());
		System.out.println("All previous status of the account [oldest to recent]:");
		//show all previous status
		trackerList.getStatus();
	

	}

}
