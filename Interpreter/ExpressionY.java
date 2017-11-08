package Interpreter;

/*
 * Author: Dinesh Kalia
 *
 * ExpressionY looks at the second character
 * of the context and interprests it as 2.	
 */

public class ExpressionY extends Expression{

	@Override
	public void interpret(Context context) {
		System.out.println("ExpressionY computing.");
		String userInput = context.getInputExpression();
		context.setInputExpression(userInput.substring(1));
		context.setOutputExpression(context.getOutputExpression() + "2");
	}

}
