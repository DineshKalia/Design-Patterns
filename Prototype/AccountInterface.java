package Prototype;

/*
 * Author: Dinesh Kalia
 * 
 * AccountInterface used to make copy of an account.
 * This is accomplished by inheriting Cloneable.
 */

public interface AccountInterface extends Cloneable {
	public AccountInterface makeCopy();
}
