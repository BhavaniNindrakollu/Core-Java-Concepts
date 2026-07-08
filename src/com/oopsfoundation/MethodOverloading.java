package com.oopsfoundation;


 /* Demonstrates Method Overloading in Java.
 * Method Overloading allows a class to have multiple methods
 * with the same name but different parameter lists.
 * It is also known as Compile-Time Polymorphism.*/
 

public class MethodOverloading {
	
	void studentDetails(String name ,String surName) {
		System.out.println("Student name is :"+name +" "+surName);
	}
	
	void studentDetails(String fatherName ) {
		System.out.println("Student father name is :"+fatherName);
	}
	
	void studentDetails(int age) {
		System.out.println("Student age is :"+age);
	}
	
	void studentDetails(double expectedSalary) {
		System.out.println("Student expected salary is :"+expectedSalary);
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.studentDetails("Bhavani","Nindrakollu");
		obj.studentDetails("Venkateswara Rao");
		obj.studentDetails(20);
		obj.studentDetails(75.00);
		

	}

}
