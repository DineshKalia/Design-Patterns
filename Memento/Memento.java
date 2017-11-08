package Memento;

/*
 * Author: Dinesh Kalia
 * 
 * Memento class contains state of an
 * object to be restored.
 */

public class Memento {

	private String status;

	public Memento(String status) {
		this.status = status;
	}
	
	public String getStatus(){
		return status;
	}
	
}
