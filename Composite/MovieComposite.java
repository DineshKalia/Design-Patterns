package Composite;
import java.util.*;

/*
 * Author: Dinesh Kalia
 * 
 * This class represents the MovieComponent
 * having leafs.
 */

public class MovieComposite extends MovieComponent {
	
	//list of childs
	private List<MovieComponent> child;
	
	public MovieComposite(int number, MovieComponent parent){
		this.number = number;
		this.parent = parent;
		this.child = new ArrayList<MovieComponent>();
	}
	
	//add a child
	public void addChild(MovieComponent movie){
		child.add(movie);
	}
	
	//remove a child
	public void removeChild(MovieComponent movie){
		child.remove(movie);
	}
	
	//count the number of leafs
	@Override
	public int getSum() {
		int result = number;
		for(MovieComponent inst: child){
			result =+ inst.getSum();
		}
		return result;
	}
	
	public List<MovieComponent> getChild(){
		return new ArrayList<MovieComponent>(child);
	}

}
