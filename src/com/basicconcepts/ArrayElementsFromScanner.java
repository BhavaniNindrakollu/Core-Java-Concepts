package com.basicconcepts;

import java.util.Scanner;

public class ArrayElementsFromScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int [] arr= new int [5];
		for(int i =0 ; i<arr.length; i++) {
			
	         System.out.println("Enter "+i+" index element : ");
			
			 arr[i]= sc.nextInt ();
			 
			 System.out.println("This is "+i+" index of arr element: "+arr[i]);
			
		}
		

	}

}
