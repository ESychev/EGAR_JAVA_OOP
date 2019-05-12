package com.egar.task1;

/**
 * The Class Airplane.
 * 
 * @author Sychev Evgenii
 */
public class Airplane implements Printable {

	/** The name. */
	private String name;

	/** The type. */
	private String type;

	/** The count. */
	private static int count;

	/** The const. */
	private final int CONST = 5;

	static {
		count = 1;
		// CONST = 5;
	}

	/**
	 * Instantiates a new airplane.
	 */
	public Airplane() {
		// count = 2;
		this.name = "DEFAULT_NAME";
	}

	/**
	 * Instantiates a new airplane.
	 *
	 * @param type the type
	 */
	public Airplane(String type) {
		this();
		this.type = type;
	}

	/**
	 * Instantiates a new airplane.
	 *
	 * @param name the name
	 * @param type the type
	 */
	public Airplane(String name, String type) {
		this.name = name;
		this.type = type;
	}

	/**
	 * Sets the count.
	 *
	 * @param count the new count
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * Show.
	 */
	public void show() {
		System.out.println(name + ";" + type + ";" + count);
	}
}