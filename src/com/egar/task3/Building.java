/**
 * 
 */
package com.egar.task3;

/**
 * The Class Building.
 *
 * @author Sychev Evgenii
 */
public abstract class Building {

	/** The city. */
	private String city;

	/** The street. */
	private String street;

	/**
	 * The Enum TypeOfConstruction.
	 */
	enum TypeOfConstruction {

		/** The house. */
		HOUSE("house"),
		/** The bank. */
		BANK("bank");

		/** The type. */
		String type;

		/**
		 * Instantiates a new type of construction.
		 *
		 * @param tipe the tipe
		 */
		TypeOfConstruction(String tipe) {
		}
	}

	/**
	 * Instantiates a new building.
	 */
	public Building() {
	}

	/**
	 * Instantiates a new building.
	 *
	 * @param city   the city
	 * @param street the street
	 */
	public Building(String city, String street) {
		this.city = city;
		this.street = street;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the street.
	 *
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Sets the street.
	 *
	 * @param street the new street
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Building{" + "city='" + city + '\'' + ", street='" + street + '\'' + '}';
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		} else
			return false;
	}
}