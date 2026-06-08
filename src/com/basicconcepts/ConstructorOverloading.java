package com.basicconcepts;

public class ConstructorOverloading {

	double rectangleLength;
	double rectangleBreadth;
	
	ConstructorOverloading(){
		rectangleLength = 10.0;
		rectangleBreadth = 5.5;
		System.out.println("Rectangle area of non parameterized constructor is:"+(rectangleLength*rectangleBreadth));
		
	}
	
	ConstructorOverloading(double a){
		rectangleLength = a;
		rectangleBreadth = a;
		
System.out.println("Rectangle area of parameterized constructor of no.of arguments is 1 and order of arguments is double :"+(rectangleLength*rectangleBreadth));
		
	
		
	}
	
	ConstructorOverloading(double l,double b){
		rectangleLength = l;
		rectangleBreadth = b;
		
		System.out.println("Rectangle area of parameterized constructor of no.of arguments is 2 and order of arguments is double,double :"+(rectangleLength*rectangleBreadth));
		
		
	}
	
	
	public static void main(String[] args) {
		ConstructorOverloading c1 = new  ConstructorOverloading();
		ConstructorOverloading c2 = new  ConstructorOverloading(5.0);
		ConstructorOverloading c3 = new  ConstructorOverloading(20.0,10.0);
		
		
	

	}

}
