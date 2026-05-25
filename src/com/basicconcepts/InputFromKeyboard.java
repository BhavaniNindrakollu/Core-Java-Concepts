package com.basicconcepts;

import java.util.Scanner;

public class InputFromKeyboard {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
	//Printing multiplication table from user
		System.out.print("Enter the number for which you want to print table :");
		
		int i=sc.nextInt();
		
		System.out.print("Enter the number where you want to stop the table :");
		
		int n= sc.nextInt();
		
		System.out.println("The multiplication table is:");
		
		for (int j=1; j<n ; j++) {
			
			System.out.println(i+"x"+j+"="+(i*j));
		}
		
		
		
		
		
	}

}
