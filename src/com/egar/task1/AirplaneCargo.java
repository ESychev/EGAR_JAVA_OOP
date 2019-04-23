package com.egar.task1;

public class AirplaneCargo extends Airplane  implements Printable {
	private double  max_cargo;
	
	public AirplaneCargo() {
		super();
	}
   public AirplaneCargo(String name, String type, double max_cargo){
    super(name, type);
    this.max_cargo= max_cargo;
   }
   
   
   public void show () {
	   super.show();
	   System.out.println("max cargo=" + max_cargo);
   }
}