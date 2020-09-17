package com.practice.three;

import com.practice.three.ifaces.Automobile;

public class Car implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Ferrari";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 10000000.00;
	}

}
