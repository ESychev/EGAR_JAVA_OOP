package com.egar.task1;

public class Airplane implements Printable {

	private  String name;
	   private String type;
	   
 
	   private static int  count;

	   private final int CONST= 5;


	   static {
		   count = 1;
		   //CONST = 5;
	   }

	   
	   public Airplane() {
		   //count = 2;
		   this.name="DEFAULT_NAME";
	   }
	   
	   public Airplane (String type) {
		   this();
		   this.type=type;
	   }
	   public Airplane(String name, String type) {
		   this.name=name;
		   this.type=type;
	   }
	   
	   
	   public void setCount(int count) {
		   this.count = count;
	   }
	   public void show() {
		   System.out.println(name+ ";"+ type+ ";" + count);
	   }
	}