package com.egar.task2;

/**
 * The Class MyAnimal.
 *
 * @author Sychev Evgenii
 */
public class MyAnimal implements Animal {

	/** The nickname. */
	String nickname;

	/** The view. */
	String view;

	/**
	 * Gets the nickname.
	 *
	 * @return the nickname
	 */
	private String getNickname() {
		return nickname;
	}

	/**
	 * Sets the nickname.
	 *
	 * @param number the new nickname
	 */
	private void setNickname(int number) {
		switch (number) {
		case 0:
			this.nickname = this.barsic;
			break;
		case 1:
			this.nickname = this.myrka;
			break;
		default:
			this.nickname = this.myrzic;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.egar.task2.Animal#getAnimal()
	 */
	@Override
	public String getAnimal() {
		String s = "Animal: " + this.view + "Name: " + getNickname();
		return s;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.egar.task2.Animal#setAnimal(int, int)
	 */
	@Override
	public void setAnimal(int number1, int number2) {
		switch (number1) {
		case 0:
			this.view = this.Animal1;
			setNickname(number2);
			break;
		default:
			this.view = this.Animal2;
			this.nickname = this.bobic;
			break;
		}
	}
}