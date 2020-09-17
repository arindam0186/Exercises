package com.practice.three;

import com.practice.three.ifaces.Automobile;

public class NewShowRoom extends ShowRoom {

	@Override
	public Automobile getProduct(int key) {
		// TODO Auto-generated method stub
		if(key==3) {
			return new Tractor();
		}
		
		return super.getProduct(key);
	}

	
}
