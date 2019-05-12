/**
 * 
 */
package com.egar.task3;

/**
 * The Class Main.
 *
 * @author Sychev Evgenii
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		FactoryCreateBilding factoryCreateBilding = new CreateBilding();
		factoryCreateBilding.print(factoryCreateBilding.create());
	}
}