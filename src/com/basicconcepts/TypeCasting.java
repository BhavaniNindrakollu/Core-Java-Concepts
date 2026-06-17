package com.basicconcepts;

public class TypeCasting {

	public static void main(String[] args) {


		//Type conversion is to convert one data type to another data type
        //There are two types of conversions 
		//1.Widning or Upcasting or Implict type casting 
        //2.Narrowing or Downcasting or Explict type casting
		//-->If we put small data type to large data type java will automatically
		//   convert the data type explictly
		//-->If we put large data type to small data type we will convert 
		// the data type explictly
		//-->We can not insert other data types into boolean and  
		//  other data types also can not take boolean data type 
		
		byte b =20;
		byte b2 = 25;
		short s = 30;
		 int i1 = 300;
		 int i2 = 330;
		 long l = 45638;
		 float f = 5.6f;
		 double d = 4.5678;
		 char ch = 'c';
		 boolean bo = true;
		 
		 i1 = b;
		 b = (byte)s;
		 b2 = (byte)i2;
		 System.out.println("Implict type casting--> int stores byte data: "+i1);
		 System.out.println("Explict type casting-->byte stores short data type: "+b);
		 System.out.println("Explict type casting-->byte stores int data type: "+b2);
		 //-->For 3rd sysout statement output is 74 because of byte takes the total range of 
		 // it and starts count from 0 so it takes 256 range and starts from 0 and finally 
		 // gives output as 74 
		 
		 //--->if we print two characters in console it will give integer values due to 
		 // automatic type promotion
		 
		 System.out.println("Printing two characters in console A & B:"+('A'+'B'));//131 because of adding asci values of A & B
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
	}

}
