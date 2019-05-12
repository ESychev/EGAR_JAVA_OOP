package com.egar.task1;

/**
 * The Interface Printable.
 *
 * @author Sychev Evgenii
 */
public interface Printable {

	/**
	 * Prints the.
	 */
	default void print() {

		System.out.println("Undefined printable");
	}
}
