package Command;

/*
 * Author: Dinesh Kalia
 * 
 * Description: Command design is a behavioral pattern
 * where an object is wrapped as a command and passed to 
 * invoker object. Invoker objects looks for the approprite
 * object that can handle the command and execute it.
 */

public class Main {

	public static void main(String[] args) {
		
		//object warpped around
		Multiply multiple = new Multiply(2);
		
		Command multiplycommand = new MultipleCommand(multiple);
		System.out.println("Created command for doubling input.");
		
		Add add = new Add(10);
		Command addCommand = new AddCommand(add);
		System.out.println("Created command for adding 10 to the input.");
		
		System.out.println("Input: 25 and double command");
		System.out.println(multiplycommand.execute(25));
		
		System.out.println("Input: 100 and add 10 command");
		System.out.println(addCommand.execute(100));
		
	}

}
