package com.exercise.three;

import com.exercise.three.ifaces.Appliances;

public class Customer {

	public Appliances getProduct(int key) {
		switch (key) {
		case 1:
			return new Computer();
		case 2:
			return new Furniture();

		default:
			return null;
		}
	}
	
	public double getRentPerDay(Appliances polyApp) {
		double totalRent = 0.0;
		System.out.println(polyApp.APPNAME);
		try {
			totalRent+= polyApp.getRatePerDay();
			return totalRent;
		}
		catch(Exception e) {
			System.out.println("Check your input");
		}
		return 0.0;
	}
}
