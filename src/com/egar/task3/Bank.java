/**
 * 
 */
package com.egar.task3;

/**
 * The Class Bank.
 *
 * @author Sychev Evgenii
 */
public class Bank extends Building {

	/** The number bank. */
	private int numberBank;

	/** The developer bank. */
	private String developerBank;

	/**
	 * Instantiates a new bank.
	 */
	public Bank() {

	}

	/**
	 * Instantiates a new bank.
	 *
	 * @param city          the city
	 * @param street        the street
	 * @param numberBank    the number bank
	 * @param developerBank the developer bank
	 */
	public Bank(String city, String street, int numberBank, String developerBank) {
		super(city, street);
		this.numberBank = numberBank;
		this.developerBank = developerBank;
	}

	/**
	 * Gets the number bank.
	 *
	 * @return the number bank
	 */
	public int getNumberBank() {
		return numberBank;
	}

	/**
	 * Sets the number bank.
	 *
	 * @param numberBank the new number bank
	 */
	public void setNumberBank(int numberBank) {
		this.numberBank = numberBank;
	}

	/**
	 * Gets the developer bank.
	 *
	 * @return the developer bank
	 */
	public String getDeveloperBank() {
		return developerBank;
	}

	/**
	 * Sets the developer bank.
	 *
	 * @param developerBank the new developer bank
	 */
	public void setDeveloperBank(String developerBank) {
		this.developerBank = developerBank;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.egar.task3.Building#toString()
	 */
	@Override
	public String toString() {
		return "Bank{" + "city='" + getCity() + "', street='" + getStreet() + "', numberBank='" + numberBank
				+ "', developerBank='" + developerBank + '\'' + '}';
	}

}
