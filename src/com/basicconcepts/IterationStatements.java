package com.basicconcepts;

public class IterationStatements {

	public static void main(String[] args) {
	
		//for loop 
		//it is used when we know the range
		System.out.println(" Printing numbers from 1 to 10 using for loop:");
		
		for (int i=1 ;i <=10 ;i++) {
			System.out.println(i);
			}
		
		//while loop 
		//while loop is used when we don not know the range
		System.out.println("Printing even numberrs upto 15");
		
		int num=1;
		
		while(num < 15 ) {
			
			if ( num % 2==0) {
			
			System.out.println(num);
			}
	    num++;
		}
				
		//do-while
		//it is used, when we have to print once if the condition is true or false
		int a=5,sum=0,n=10;
		
		do {
			System.out.println("sum=:"+sum); 
			sum+=a;
			a++;
		}
		
		while(a<n );
			
			System.out.println("The number is positive number");
		
		//nested for loop
			
		for (int i=1 ; i<=5 ; i++) {
			
			for (int j=1; j<=i; j++) {
				
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		//using break 
		System.out.println("Break statement");
		
		for(int i =0; i<=10; i++) {  
			
			if(i == 5)
				break;
				System.out.println(i);
			}
		
		
		//using continue
		System.out.println("Continue statement");
		
				for(int i =0; i<=10; i++) {  
					
					if(i == 5)
						continue;
						System.out.println(i);
					}

		}

	}


