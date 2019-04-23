package com.egar.task1;

public class AirplanePassenger extends Airplane implements Printable {
	private int number_places;
	
	
	public AirplanePassenger() {
		super();
	}
	
	public AirplanePassenger(String name, String type, int nember_placess ) {
		super (name,type);
		this.number_places=number_places;
	}
	
	
	public void show() {
		super.show();
		System.out.println(" number_places "+ number_places);
	}

}
