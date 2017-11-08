package Command;

/*
 * Author: Dinesh Kalia
 * 
 * Multiply command created using Command interface.
 */

public class MultipleCommand implements Command {

	private Multiply multiply;
	
	public MultipleCommand(Multiply multiply) {
		this.multiply = multiply;
	}
	
	//send input to operation class.
	@Override
	public int execute(int input) {
		return multiply.compute(input);
	}

}
