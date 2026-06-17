package com.oopsfoundation;

public class ClassObject {
	
	int id ;
	String name ;
	double percentage;
	
	void StudentDetails (){
		
		System.out.println("Student id number is :"+id);
		
		System.out.println("Student name is :"+name);
		
		System.out.println("Student percentage is :"+percentage);
		
	}

	public static void main(String[] args) {
		
		ClassObject obj1 = new ClassObject();
		obj1.id = 501;
		obj1.name="Bhavani";
		obj1.percentage=95.5;
		
		ClassObject obj2 = new ClassObject();
		obj2.id = 502;
		obj2.name="Bhavya";
		obj2.percentage=90.5;
		
		obj1.StudentDetails ();
		obj2.StudentDetails ();

	}

}
