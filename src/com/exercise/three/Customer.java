package com.exercise.three;

import com.exercise.three.ifaces.Appliances;

public class Customer {

	public Appliances getProduct(int key, int days) {
		
		switch (key) {
		case 1:
			return new Computer(days);
		case 2:
			return new Furniture(days);

		default:
			return null;
		}
	}
	
	public double getRent(Appliances polyApp) {
		
		try {
			return polyApp.getRent();
		}
		catch(Exception e) {
			System.out.println("Check your input");
		}
		return 0.0;
	}
	
	public String getName(Appliances polyApp) {
		return polyApp.getName();
	}
}
