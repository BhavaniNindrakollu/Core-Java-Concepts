package com.basicconcepts;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);

		int num1=10;
		int num2=25;
		int num3=30;

		//if condition 

		if(num1 % 2 == 0) {

			System.out.println(num1+" is even number");
		}

		//if-else condition 

		if(num2 % 2 == 0) {  //checking even or odd

			System.out.println(num2+" is even number");
		}
		else {
			System.out.println(num2+"is odd number");
		}

		//nested if condition  
		if( num1 > num2 ) { //picking greater number from 3 numbers

			if( num1 > num3) {
				System.out.println("num1 is greater");
			}
			else {
				System.out.println("num3 is greater");
			}

		}
		else {
			if( num2 > num3) {
				System.out.println("num2 is greater"); 
			}
			else {
				System.out.println("num3 is greater");
			}

		}

		//else-if ladder
		System.out.println("Enter your marks here :");
		int marks = sc.nextInt(); //Grading problem

		if(marks < 0 || marks > 100) {
			System.out.println("Invalid marks...Please enter valid marks");
		}

		else if(marks >= 90) {
			System.out.println("Congratulations fot getting Grade A");
		}
		
		else if(marks >= 80 && marks < 90) {
			System.out.println("Congratulations fot getting Grade B");
		}
		
		else if(marks >= 70 && marks < 80) {
			System.out.println("Congratulations fot getting Grade C");
		}
		
		else if(marks >= 60 && marks < 70) {
			System.out.println("Congratulations fot getting Grade D ");
		}
		else if(marks >= 50 && marks < 60) {
			System.out.println("Congratulations fot getting Grade E");
		}
		
		else {
			System.out.println("Sorry you are fail...betterluck next time");
		}
		
		
		//Switch case 
		
		String Language="Java";
		  
		switch ("Java") {
		
		case "Python" : 
			System.out.println("This is python programming");
			break;
		
		
	   case ".net" : 
		System.out.println("This is .net programming");
		break;
		
	   case "Java" : 
	   case "JavaBackend":
			System.out.println("This is Java programming");
			break;
			
	   case "Frontend":
		   System.out.println("This is frontend for web page designing");
		   sc.close();
		  
	   
	}




	}

}
