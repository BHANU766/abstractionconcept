package com.abstraction;

public class Drivermain {

	public static void main(String[] args) {
		
        Passenger pp=new Passenger();
        Cargoplane cp=new Cargoplane();
        
        Airport a=new Airport();
        a.permit(cp);
//      a.permit(pp);
	}

}
