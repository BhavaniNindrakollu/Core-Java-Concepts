package com.basicconcepts;

public class DataTypes {

	public static void main(String[] args) {
		// Default value of byte, short, integer and long is 0
		// Default value of float is 0.0f
		// Default value of double is 0.0d
		// Default value of char is '\u0000'
		// Default value of boolean is false
		byte b= 25;
		short s =199;
		int i =66756677;
		long l = 9223372036854775807L;
		float f =2.34f;
		double d= 4.889556783444;
		boolean b1 = true;
		boolean b2 = false;
		char ch = 'c';




		System.out.println("Minimum value of byte:"+Byte.MIN_VALUE);
		System.out.println("Maximum value of byte:"+Byte.MAX_VALUE);

		System.out.println("Minimum value of short:"+Short.MIN_VALUE);
		System.out.println("Maximum value of short:"+Short.MAX_VALUE);


		System.out.println("Minimum value of integer:"+Integer.MIN_VALUE);
		System.out.println("Maximum value of integer:"+Integer.MAX_VALUE);

		System.out.println("Minimum value of long:"+Long.MIN_VALUE);
		System.out.println("Maximum value of long:"+Long.MAX_VALUE);

		System.out.println("Minimum value of float:"+Float.MIN_VALUE);
		System.out.println("Maximum value of float:"+Float.MAX_VALUE);

		System.out.println("Minimum value of double:"+Double.MIN_VALUE);
		System.out.println("Maximum value of double:"+Double.MAX_VALUE);

		System.out.println("Boolean true value:"+Boolean.TRUE);
		System.out.println("Boolean false value:"+Boolean.FALSE);

		System.out.println("Minimum value of char:"+(int)Character.MIN_VALUE);
		System.out.println("Maximum value of char:"+(int)Character.MAX_VALUE);

		//		Non-primitive data types are 
		//		Arrays
		//		Collections
		//		Interface
		//		Class
		//      These non primitive data types do not have specific size
		//      Default value of non primitive data types is null


	}

}
