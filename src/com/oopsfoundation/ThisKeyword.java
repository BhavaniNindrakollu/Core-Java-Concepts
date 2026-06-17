package com.oopsfoundation;

public class ThisKeyword {
	
	int salary;
	ThisKeyword(int salary){
		
		this.salary=salary;
		
	}
	void display() {
		System.out.println("Salary is:"+salary);
	}

	public static void main(String[] args) {
		
		ThisKeyword tk= new ThisKeyword(50000);
		tk.display();
		
		

	}

}
