package com.abstraction;

public class Airport {
	
  public void permit(Plane plane) {
	  //call the all implementation
	  plane.airport(); 
	  plane.takeoff();
	  plane.landing();
	  plane.fly();
  }
	
	

}
