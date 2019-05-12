package com.egar.task1;

/**
 * The Class AirplaneCargo.
 *
 * @author Sychev Evgenii
 */
public class AirplaneCargo extends Airplane implements Printable {

	/** The max cargo. */
	private double max_cargo;

	/**
	 * Instantiates a new airplane cargo.
	 */
	public AirplaneCargo() {
		super();
	}

	/**
	 * Instantiates a new airplane cargo.
	 *
	 * @param name      the name
	 * @param type      the type
	 * @param max_cargo the max cargo
	 */
	public AirplaneCargo(String name, String type, double max_cargo) {
		super(name, type);
		this.max_cargo = max_cargo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.egar.task1.Airplane#show()
	 */
	@Override
	public void show() {
		super.show();
		System.out.println("max cargo=" + max_cargo);
	}
}