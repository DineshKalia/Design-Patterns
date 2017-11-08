package Interpreter;

/*
 * Author: Dinesh Kalia
 * 
 * This class recieves the context from user 
 * and returns the output.
 */

public class Context {

	private String inputExpression;
	private String outputExpression;
	
	public Context(String input) {
		this.inputExpression = input;
	}
	
	public String getInputExpression(){
		return inputExpression;
	}
	
	public void setInputExpression(String input){
		this.inputExpression = input;
	}
	
	//return the output expression.
	public String getOutputExpression(){
		return outputExpression;
	}
	
	public void setOutputExpression(String output){
		this.outputExpression = output;
	}
}

