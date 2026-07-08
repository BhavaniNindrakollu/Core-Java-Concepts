package com.oopsconcept;

//Demonstrates Multiple Inheritance using Interfaces.
//Java does not support multiple inheritance through classes.
//A class cannot extend more than one class.
//Multiple inheritance through classes can lead to the Diamond Problem.

interface Camera{
	
	default void start () {
		System.out.println("Camera is turning on....");
		
		
	}
}

interface MediaPlayer{
	
	default void start () {
		System.out.println("MediaPlayer is starting....");
		
		
	}
}

class SmartPhone implements Camera ,MediaPlayer{
	public void start() {
		Camera.super.start();
		MediaPlayer.super.start();
		
	}
}

public class MultipleInheritance {
	
	
	public static void main(String[] args) {
		SmartPhone sm = new SmartPhone();
		sm.start();
		


	}

}
