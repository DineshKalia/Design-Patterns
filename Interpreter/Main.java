package Interpreter;

import java.util.ArrayList;

/*
 * Author: Dinesh Kalia
 * 
 * Description: Interpreter design is a behavioral pattern
 * that provides way of evaluating language or expression.
 * The expression interface tells to interpret user request
 * in particular context.
 */

public class Main {

	public static void main(String[] args) {
		
		//make a context
		Context context = new Context("xy");
		
		//make expressions list
		ArrayList<Expression> expressionList = new ArrayList<Expression>();
		
		//add expression x and y to the list.
		expressionList.add(new ExpressionX());
		expressionList.add(new ExpressionY());
		
		//interpret expressions in the list.
		for (Expression expression: expressionList){
			expression.interpret(context);
		}
		
		//show to user.
		System.out.println(context.getOutputExpression());
	}

}
