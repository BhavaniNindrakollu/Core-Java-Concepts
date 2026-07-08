package com.oopsconcept;

/*Hierarchical Inheritance is multtiple sub classes inheriting properties from 
single super class */

class Vehicles{
	
	 void display1() {
		System.out.println("This is  Vehicles class");
	}
}

class Autos extends Vehicles{
	
	 void display2() {
		System.out.println("This is Autos class extends from Vehicles class");
	}
	
}
class Bikes extends Vehicles{
	void display3 () {
		System.out.println("This is Bike class extends from Vehicles class");
		
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		Autos a = new Autos();
		a.display2();
		a.display1();//Calling method in vehicle class
		
		Bikes b = new Bikes ();
		b.display3();
		
		b.display1();//Calling method in vehicle class
		
		

	}

}
