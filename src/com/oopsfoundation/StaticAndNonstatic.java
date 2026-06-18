package com.oopsfoundation;

public class StaticAndNonstatic {

	static String college = "Engineering College";

    int id;
    String name;

    static void showCollege() {
        System.out.println("College: " + college);
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
	public static void main(String[] args) {
		
		

		    

		   

		StaticAndNonstatic s1 = new StaticAndNonstatic();
		        s1.id = 101;
		        s1.name = "Bhavani";

		        StaticAndNonstatic s2 = new StaticAndNonstatic();
		        s2.id = 102;
		        s2.name = "Durga";

		        showCollege(); // static method call

		        s1.display();
		        s2.display();
		    }
		

	}

