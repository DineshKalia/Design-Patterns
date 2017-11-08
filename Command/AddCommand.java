package Command;

/*
 * Author: Dinesh Kalia
 * 
 * Add command created using Command interface.
 */

public class AddCommand implements Command {

	private Add add;
		
	public AddCommand(Add add) {
		this.add = add;
	}

	// send input to operation class.
	@Override
	public int execute(int input) {
		return add.compute(input);
	}

}
