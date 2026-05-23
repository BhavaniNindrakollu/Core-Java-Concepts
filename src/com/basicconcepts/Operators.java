package com.basicconcepts;

public class Operators {

	public static void main(String[] args) {
	
		
		int i=20;
		int j=10;
		int k=20;
		
		//Assignment Operators
		
		System.out.println("Addition operation is :"+(i+j));
		System.out.println("Subtraction operation is :"+(i-j));
		System.out.println("Multiplication operation is :"+(i*j));
		System.out.println("Divisionion operation is :"+(i/j));
		System.out.println("Modulo operation for remainder is :"+(i%j));
		
		//Unary Operators
		
		System.out.println("Initial i value is :"+i);
		System.out.println("Pre incremented i value is :"+(++i));
		System.out.println("Post incremented i value is :"+(i++));
		System.out.println("i value after post increment is :"+(i));
		
		System.out.println("Now i value is :"+i);
		System.out.println("Pre decremented i value is :"+(--i));
		System.out.println("Post decremented i value is :"+(i--));
		System.out.println("i value after post decrement is :"+(i));
		
		//Relational Operators
		
		System.out.println(i==j);
		System.out.println(i!=j);
		System.out.println(i>j);
		System.out.println(i<j);
		System.out.println(i>=j);
		System.out.println(i<=j);
		
		//Conditional Operators
		
		System.out.println("OR operator used "+(i>j || i==j));
		System.out.println("AND operator used "+(i>j && i==k));
		
		//Assignment Operators
		
		System.out.println("Assigning addition of 5  to i is :"+(i+=5));
		System.out.println("Assigning subtraction of 5 to i is :"+(i-=5));
		System.out.println("Assigning multiplication of 2 to i is :"+(i*=2));
		System.out.println("Assigning division of 2 to i is :"+(i/=2));
		System.out.println("Assigning modulo of 2 to i is :"+(i%=2));
		
        
	}

}
