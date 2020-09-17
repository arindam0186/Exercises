package com.practice.three;

import com.practice.three.ifaces.Automobile;

public class Tractor implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "JCB";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 200000;
	}

}
