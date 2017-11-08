package Mediator;

/*
 * Author: Dinesh Kalia
 * 
 * Description: Mediator design is a behavioral pattern
 * used to reduce communication complexity between objects/classes.
 * The mediator class handles communication between different classes. 
 */

public class Main {

	// making a chatroom (mediator) which will handle user messages
	// print out message in central room where both users can interacts with each other.
	public static void main(String[] args) {

		//making 2 users.
		User bob = new User("Bob");
		User john = new User("John");
		
		//users sending messages. 
		bob.sendUserMessage("Hi, i need more information about creating accounts!");
		john.sendUserMessage("Hi Bob, certianly!");
	}

}
