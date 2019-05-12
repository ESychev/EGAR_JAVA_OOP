/**
 * 
 */
package com.egar.task3;

import java.util.Scanner;

/**
 * The Class CreateBilding.
 *
 * @author Sychev Evgenii
 */
public class CreateBilding implements FactoryCreateBilding {

	/** The st. */
	Scanner st = new Scanner(System.in);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.egar.task3.FactoryCreateBilding#create()
	 */
	@Override
	public Building create() {
		System.out.println("What are we going to build? House (1) or Bank(2).");

		if (st.nextInt() == 1) {
			System.out.println("Enter City");
			String city = st.next();
			System.out.println("Enter Street");
			String street = st.next();
			System.out.println("Enter number house");
			int numberHouse = st.nextInt();
			System.out.println("Enter developer house");
			String developerName = st.next();
			return new House(city, street, numberHouse, developerName);
		} else {
			System.out.println("Enter City");
			String city = st.next();
			System.out.println("Enter Street");
			String street = st.next();
			System.out.println("Enter number Bank");
			int numberBank = st.nextInt();
			System.out.println("Enter developer Bank");
			String developerBank = st.next();
			return new Bank(city, street, numberBank, developerBank);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.egar.task3.FactoryCreateBilding#print(com.egar.task3.Building)
	 */
	@Override
	public void print(Building building) {
		System.out.println(building);
	}
}
