package Mediator;

/*
 * Author: Dinesh Kalia
 * 
 * Mediator class recieves which user sent what
 * message and prints it in chatroom.
 */

public class Mediator {
	public static void sendMessage(String user, String text){
		System.out.println(user + " : " + text);
	}
}
