package com.arrays;

public class ForEach {

	public static void main(String[] args) {
	    //Using for each for singleDimension array
		int [] arr = {10,20,30,40,50};
		System.out.println("Values in arr array");
		int sum =0;
		for(int values:arr) {
			System.out.println(values);
			
			sum+=values;
		}
		System.out.println("Sum of the array elements are:"+sum);
		System.out.println("Average of the array elements :"+sum/arr.length);
		
		//Using for each for 2DimensionalArray
		
		int [] [] arr1 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
		};
		
		
		 int sum1=0;
		 int noOfElements =0;
		for(int [] singleDimensionalArray:arr1) {
			
			for(int values : singleDimensionalArray) {
				sum1+=values;
				noOfElements++;
				System.out.print(values+" ");
				
			}
			System.out.println();
		}
		System.out.println("Sum of the arr1 elements are:"+sum1);
		System.out.println("Average of arr1 elements:"+sum1/noOfElements);
		
		//Using for each for JaggeedArray
		
				int [] [] arr2 = {
						{11,22},
						{44,55,66},
						{7}
						
				};
				
				
				 int sum2=0;
				 int noOfElements1 =0;
				for(int [] singleDimensionalArray:arr2) {
					
					for(int values : singleDimensionalArray) {
						sum2+=values;
						noOfElements1++;
						System.out.print(values+" ");
						
					}
					System.out.println();
				}
				System.out.println("Sum of the arr1 elements are:"+sum2);
				System.out.println("Average of arr1 elements:"+sum2/noOfElements1);
			
	}
	

}
