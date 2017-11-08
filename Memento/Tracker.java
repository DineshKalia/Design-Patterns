package Memento;

import java.util.ArrayList;
import java.util.List;

/*
 * Author: Dinesh Kalia
 * 
 * Tracker is responsible to restore object
 * state from memento.
 */

public class Tracker {

	private List<Memento> statusList = new ArrayList<Memento>();
	
	public void addStatus(Memento status){
		statusList.add(status);
	}
	
	public void getStatus(){
		for(Memento stat: statusList){
			System.out.println(stat.getStatus());
		}
	}
	public Memento getIndex(int index){
		return statusList.get(index);
	}
}
