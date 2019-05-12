package com.egar.task2;

/**
 * The Interface Animal.
 *
 * @author Sychev Evgenii
 */
public interface Animal extends Cat, Dog {

	/** The Animal 1. */
	String Animal1 = "Cat";

	/** The Animal 2. */
	String Animal2 = "Dog";

	/**
	 * Sets the animal.
	 *
	 * @param number1 the number 1
	 * @param number2 the number 2
	 */
	void setAnimal(int number1, int number2);

	/**
	 * Gets the animal.
	 *
	 * @return the animal
	 */
	String getAnimal();
}
