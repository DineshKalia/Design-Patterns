package Mediator;

/*
 * Author: Dinesh Kalia
 * 
 * User class responsible for making user and sending 
 * his/her message to mediator.
 */

public class User implements UserInterface {

	String name;
	
	public User(String name) {
		this.name = name;
	}

	@Override
	public String getUsername() {

		return this.name;
	}

	@Override
	public void setUsername(String username) {
		this.name=username;

	}

	@Override
	//sending message to mediator.
	public void sendUserMessage(String text) {

		Mediator.sendMessage(this.name, text);
	}

}
