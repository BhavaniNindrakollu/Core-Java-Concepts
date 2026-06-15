package com.basicconcepts;

public class CallByValue {
	
	static void Swap(int a,int b) {
		int temp=a;;
		a=b;
		b=temp;
		System.out.println("Inside method");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}

	public static void main(String[] args) {
		int x=10;
		int y=20;
		
		System.out.println("Before swap");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		Swap(x,y);
		
		System.out.println("After swap");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		
		
	

	}

}
