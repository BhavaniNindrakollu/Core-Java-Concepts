package com.arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		//first way to declaring and initializing 
		int arr1 [] [] = new int [3] [2];

		arr1[0][0] = 1;
		arr1[0][1] = 2;

		arr1[1][0] = 11;
		arr1[1][1] = 12;

		arr1[2][0] = 111;
		arr1[2][1] = 112;

		int size=0;
		int rowSize = 0;
		//retrieving values by using for loop


		for( int i =0; i<arr1.length; i++) { //rows loop

			size+= arr1[i].length;
			rowSize =arr1[i].length;

			for( int j=0; j<arr1[i].length; j++) { //column loop

				System.out.print(arr1[i][j]+" ");


			}
			System.out.println();
		}

		System.out.println("Size of the row in arr1 is:"+rowSize);
		System.out.println("Size of the entire array or overall elements in arr1 is:"+size);

		//Second way to declaring and initializing the 2D array

		int [] [] arr2 = new int [2][3];
		arr2[0]=new int [] {3,2,1};
		arr2[1]=new int [] {6,5,4};

		for( int i =0; i<arr2.length; i++) { //rows loop

			size+= arr2[i].length;
			rowSize =arr2[i].length;

			for( int j=0; j<arr2[i].length; j++) { //column loop

				System.out.print(arr2[i][j]+" ");


			}
			System.out.println();
		}

		System.out.println("Size of the row in arr2 is:"+rowSize);
		

		//Third way of declaring and initializing array
		int[][] arr3 = {
				{10,20,30},{40,50,60}
		};

		for( int i =0; i<arr3.length; i++) { //rows loop

			size+= arr3[i].length;
			rowSize =arr3[i].length;

			for( int j=0; j<arr3[i].length; j++) { //column loop

				System.out.print(arr3[i][j]+" ");


			}
			System.out.println();
		}

		System.out.println("Size of the row in arr3 is:"+rowSize);
		




	}

}
