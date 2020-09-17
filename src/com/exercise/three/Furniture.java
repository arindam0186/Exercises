package com.exercise.three;

import com.exercise.three.ifaces.Appliances;

public class Furniture implements Appliances {

	@Override
	public double getRatePerDay() {
		// TODO Auto-generated method stub
		return 500.00;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Furniture";
	}
}
