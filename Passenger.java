package com.abstraction;

public class Passenger extends Plane {
	
    //implementation to all abstract performed in child class
	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("passenger plane need medium runway to take off");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("passenger plane flies at medium height");
		
	}

	@Override
	public void landing() {
		// TODO Auto-generated method stub
		System.out.println("passenger plane need medium runway to land");
		
	}

}
