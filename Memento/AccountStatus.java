package Memento;

/*
 * Author: Dinesh Kalia
 * 
 * AccountStatus creates and stores status
 * in memento objects
 */

public class AccountStatus {
	
	private String status;
	
	public void setStatus(String newStatus){
		this.status = newStatus;
	}
	
	public String getStatus(){
		return this.status;
	}
	
	public Memento saveStatus(){
		return new Memento(status);
	}
	
	public void getSavedStatus(Memento savedStatus){
		status = savedStatus.getStatus(); 
	}
	
	
}
