package com.egar.task1;

/**
 * The Class AirplanePassenger.
 *
 * @author Sychev Evgenii
 */
public class AirplanePassenger extends Airplane implements Printable {

	/** The number places. */
	private int number_places;

	/**
	 * Instantiates a new airplane passenger.
	 */
	public AirplanePassenger() {
		super();
	}

	/**
	 * Instantiates a new airplane passenger.
	 *
	 * @param name           the name
	 * @param type           the type
	 * @param nember_placess the nember placess
	 */
	public AirplanePassenger(String name, String type, int nember_placess) {
		super(name, type);
		this.number_places = number_places;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.egar.task1.Airplane#show()
	 */
	@Override
	public void show() {
		super.show();
		System.out.println(" number_places " + number_places);
	}

}
