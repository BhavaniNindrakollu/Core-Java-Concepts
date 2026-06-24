package com.oppsconcept;

//In this single inheritance a class extends another one class only

class Vehicle{
	 
	void parent() {
		System.out.println("This is super class or parent class");
	}
}

class Car extends Vehicle{
	
	void child() {
		System.out.println("This is sub class or child class");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
	
		Car c = new Car();
		c.parent();
		c.child();
	}

}
