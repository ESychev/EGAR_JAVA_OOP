package com.egar.task2;

public class Main {

	public static void main(String[] args) {
		MyAnimal my1 = new MyAnimal();
        my1.setAnimal(0, 2);
        System.out.println(my1.getAnimal());
        MyAnimal my2 = new MyAnimal();
        my2.setAnimal(1, 0);
        System.out.println(my2.getAnimal());
    }
}