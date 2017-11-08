package Composite;

/*
 * Author: Dinesh Kalia
 * 
 * Description: Composite design is a structural pattern
 * that composes objects interms of tree structure.
 * This pattern creates a class that has group of its
 * own objects. 
 */

public class Main {

	public static void main(String[] args) {

		System.out.println("Parent is Adventure Section");
		MovieComponent Adventure = new MovieComposite(2, null);
		
		//make group of 5 leafs with adventure genre. 
		MovieComponent A1 = new MovieComposite(5, Adventure);
		
		//add movie to it.
		Adventure.addChild(A1);
		
		//total number of slots in the genre.
		System.out.println(Adventure.getSum());
	}

}
