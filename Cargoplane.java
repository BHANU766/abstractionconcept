package com.abstraction;

public class Cargoplane extends Plane {

	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		System.out.println("cargo plane need longer runway to takeoff "); 
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("cargo plane flies at low heights");
		
	}

	@Override
	public void landing() {
		// TODO Auto-generated method stub
		System.out.println("cargo plane need longer runway to land");
		
	}

}
