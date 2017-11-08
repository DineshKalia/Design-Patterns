package Composite;
import java.util.*;

/*
 * Author: Dinesh Kalia
 * 
 * This abstract interface provides features
 * that add/remove leaf from its parent.
 */

public abstract class MovieComponent {

	protected int number;
	protected MovieComponent parent = null;
	
	
	public abstract int getSum();
	
	public List<MovieComponent> getChild(){
		return new ArrayList<MovieComponent>();
	}
	
	//adds leaf
	public void addChild(MovieComponent movie){}
	
	//delete leaf
	public void removeChild(MovieComponent movie){}
}
