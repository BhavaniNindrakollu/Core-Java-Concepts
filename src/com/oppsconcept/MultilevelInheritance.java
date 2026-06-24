package com.oppsconcept;

// In this Multilevel Inheritance a derived class inherits from a super or parent class
// The derived class also acts as the parent class to other class
class VehicleName{
	
	void display1() {
		System.out.println("This is parent class or super class");
	}
	
}
class Bike extends VehicleName{
	
	void display2() {
		System.out.println("This a child class extends from parent class VehicleName");
	}
	
}
class HeroBike extends Bike{
	void display3() {
		System.out.println("This is a class extends from parent class Bike");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		HeroBike mc = new HeroBike();
		mc.display1();
		mc.display2();
		mc.display3();
		

	}

}
