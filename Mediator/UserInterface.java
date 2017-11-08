package Mediator;

/*
 * Author: Dinesh Kalia
 * 
 * UserInterface used to make user and send messages.
 */

public interface UserInterface {
	public String getUsername();
	public void setUsername(String name);
	public void sendUserMessage(String text);
}
