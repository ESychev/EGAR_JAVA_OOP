package com.egar.task1;


public class Main {

	public static void main(String[] args) {
		
        Airplane air1 = new Airplane ("Air1", "passenger");
        Airplane air2 = new Airplane ("Air2", "cargo");
        
        air1.show();
        air2.show();
        
         
        air1.setCount(10);
        
        air1.show();
        air2.show();
        
        
        Airplane air3 = new Airplane ("myType");
        air3.show();
        
        AirplaneCargo airCargo = new AirplaneCargo("AirCargo", "cargotype" , 400);
        airCargo.show();
        
        AirplanePassenger airPass = new AirplanePassenger("Passenger","Pass", 12);
        airPass.show();
	}

}