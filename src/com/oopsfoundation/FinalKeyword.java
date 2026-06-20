package com.oopsfoundation;

// Final Keyword Demo Program

// --------------------------------------------------
// 1. FINAL CLASS
// A final class cannot be inherited (extended).
// --------------------------------------------------
final class College {

    void showCollege() {
        System.out.println("College:St.Mary's Engineering College");
    }
}

// --------------------------------------------------
// 2. FINAL METHOD
// A final method cannot be overridden by child class.
// --------------------------------------------------
class Person {

    final void displayRole() {
        System.out.println("Role: Student");
    }
}

class Student extends Person {

    // The below method cannot be overridden because
    // displayRole() is declared as final in Person class.

    /*
    void displayRole() {
        System.out.println("Role: Developer");
    }
    */
}


public class FinalKeyword {

    // 3. FINAL VARIABLE
    // Value cannot be changed once assigned.
    static final String COUNTRY = "India";

    public static void main(String[] args) {

        System.out.println("----- Final Variable Demo -----");
        System.out.println("Country: " + COUNTRY);

        // COUNTRY = "USA"; // Error: Cannot change final variable

        System.out.println("\n----- Final Method Demo -----");
        Student s = new Student();
        s.displayRole();

        System.out.println("\n----- Final Class Demo -----");
        College c = new College();
        c.showCollege();
    }
}