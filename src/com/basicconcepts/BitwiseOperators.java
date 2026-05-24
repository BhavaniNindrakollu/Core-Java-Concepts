package com.basicconcepts;

public class BitwiseOperators {

	public static void main(String[] args) {

		int num1=12;

		int num2= 7;

		System.out.println("Performing bitwise AND operation for num1 & num2: "+(num1 & num2));

		System.out.println("Performing bitwise OR operation num1 & num2: "+(num1 | num2));

		System.out.println("Performing bitwise XOR operation num1 & num2: "+(num1 ^ num2));

		System.out.println("Performing bitwise NOT operation for num2: "+( ~ num2));

		System.out.println("Performing bitwise leftshift operation for num1: "+( num1<<2 ));

		System.out.println("Performing bitwise rightshift operation for num1: "+(num1>>2));


	}

}
