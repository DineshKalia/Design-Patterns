package TemplateMethod;

/*
 * Author: Dinesh Kalia
 * 
 * An abstract account template. An account
 * must have all these basic operations.
 */

public abstract class AbstractAccountTemplate {
	abstract void setupBalance();
	abstract void setupDeposit();
	abstract void setupWithdraw();
	
	public final void launch(){
		setupBalance();
		setupDeposit();
		setupWithdraw();
	}
}
