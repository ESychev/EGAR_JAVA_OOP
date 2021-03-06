/**
 * 
 */
package com.egar.task3;

/**
 * The Class House.
 *
 * @author Sychev Evgenii
 */
public class House extends Building {

	/** The number house. */
	private int numberHouse;

	/** The developer name. */
	private String developerName;

	/**
	 * Instantiates a new house.
	 */
	public House() {
	}

	/**
	 * Instantiates a new house.
	 *
	 * @param city          the city
	 * @param street        the street
	 * @param numberHouse   the number house
	 * @param developerName the developer name
	 */
	public House(String city, String street, int numberHouse, String developerName) {
		super(city, street);
		this.numberHouse = numberHouse;
		this.developerName = developerName;
	}

	/**
	 * Gets the number house.
	 *
	 * @return the number house
	 */
	public int getNumberHouse() {
		return numberHouse;
	}

	/**
	 * Sets the number house.
	 *
	 * @param numberHouse the new number house
	 */
	public void setNumberHouse(int numberHouse) {
		this.numberHouse = numberHouse;
	}

	/**
	 * Gets the developer nameŠ.
	 *
	 * @return the developer nameŠ
	 */
	public String getDeveloperNameŠ() {
		return developerName;
	}

	/**
	 * Sets the developer nameŠ.
	 *
	 * @param developerNameŠ the new developer nameŠ
	 */
	public void setDeveloperNameŠ(String developerNameŠ) {
		this.developerName = developerNameŠ;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.egar.task3.Building#toString()
	 */
	@Override
	public String toString() {
		return "House{" + "city='" + getCity() + "', street='" + getStreet() + "', numberHouse='" + numberHouse
				+ "', developerName='" + developerName + '\'' + '}';
	}
}
