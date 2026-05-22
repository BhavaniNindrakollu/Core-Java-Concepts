package com.basicconcepts;

public class Variables {
	
	static String  name="Bhavani";//class  (static) variable
	
	int age=20;//instance (non static) variable
	
    float decimal=25.8f;//instance (non static) variable
    
	public static void main(String[] args) {
		
		int num1 = 10;//local variables
		
		int num2 = 20;
		
		
		System.out.println("Addition of num1 and num2 is :"+(num1+num2));
		
		
		System.out.println("The name is used in variables is :"+name);
		
		Variables vb =new Variables();
		
		System.out.println("The age is used in variables is :"+vb.age);
		
		System.out.println("The decimal is used in variables is :"+vb.decimal);
		
	}

}
