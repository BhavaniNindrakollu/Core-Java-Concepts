package com.oopsfoundation;

public class Constructor {

	static int i;
	
	Constructor(){
		System.out.println("This is Non parameterized constructor");
	}
	
	Constructor(String name){
		System.out.println("This is parameterized constructor");
		
		System.out.println("We are printing string name is :"+name);
	}
	Constructor(int i){
		this.i=i;
		System.out.println("This is also parameterized constructor");
		System.out.println("This is an integer value:"+i);
	}
	
	public static void main(String[] args) {

		Constructor s1= new Constructor();
		
		Constructor s2= new Constructor("Java");
		
		Constructor s3= new Constructor(225);

		

		
	}

}
