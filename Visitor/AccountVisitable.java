package Visitor;

/*
 * Author: Dinesh Kalia
 * 
 * Accepting the visitor.
 */

interface AccountVisitable {
	public double accept(AccountVisitor accountVisitor);
}
