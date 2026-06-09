package com.basicconcepts;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		//First way to declaring an array 
		
		int [] arr1 = new int [5]; 
		
		 // initialization of arr1
		
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 1;
		arr1[3] = 3;
		arr1[4] = 5;
		
		//Second way to declaring array
		
		//int arr2 []=new int [4];
		
		//second way to declaring and initializing 
		int []arr2 =new int [] {10,20,30,40,50};//if we know the values
		
		//third way to declaring and initializing 
		
		int [] arr3 = {100,200,300,400,500};
		
		//Retrieving values from arr1,arr2,arr3
		
		System.out.println("Printing first array elements:");
		
		for( int i=0 ; i<arr1.length ; i++) {
			System.out.println(arr1[i]);
		}
		
System.out.println("Printing seecond array elements:");
		
		for( int i=0 ; i<arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
		
System.out.println("Printing third array elements:");
		
		for( int i=0 ; i<arr3.length ; i++) {
			System.out.println(arr3[i]);
		}

	}

}
