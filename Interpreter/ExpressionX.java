package Interpreter;

/*
 * Author: Dinesh Kalia
 * 
 * ExpressionX looks at the first character
 * of the context and interprests it as 1.	
 */

public class ExpressionX extends Expression{

	@Override
	public void interpret(Context context) {
		System.out.println("ExpressionX computing.");
		String userInput = context.getInputExpression();
		context.setInputExpression(userInput.substring(1));
		context.setOutputExpression("1");
	}

}
