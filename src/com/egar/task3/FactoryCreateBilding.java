/**
 * 
 */
package com.egar.task3;

/**
 * The Interface FactoryCreateBilding.
 *
 * @author Sychev Evgenii
 */
public interface FactoryCreateBilding {

	/**
	 * Creates the.
	 *
	 * @return the building
	 */
	Building create();

	/**
	 * Prints the.
	 *
	 * @param building the building
	 */
	void print(Building building);
}