package com.abstraction;

//class->abstraction
abstract public class Plane {

    //method->without implementation->abstract method
	abstract public void takeoff();
	abstract public void fly();
	abstract public void landing();
	
	
	//normal method
	public void airport() {
		System.out.println("all planes need airport");
	}
	
}
