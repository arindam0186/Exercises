package com.exercise.three;

import com.exercise.three.ifaces.Appliances;

public class Computer implements Appliances {

	int days;
	double ratePerDay = 1000.00;
	
	public Computer(int days) {
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
		return "Computer";
	}

}
