package com.egar.task1;

public interface Printable {
	   default void print(){
	         
	        System.out.println("Undefined printable");
	    }
}
