package com.exercise.three;

import com.exercise.three.ifaces.Appliances;

public class Furniture implements Appliances {

	int days;
	double ratePerDay = 500.00;
	
	public Furniture(int days) {
		this.days = days;
	}
	
	@Override
	public double getRent() {
		// TODO Auto-generated method stub
		return ratePerDay*days;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Furniture";
	}
}
