package com.practice.six.multithreading;

public class NumberService {
	
	public void sumNumbers(int countTo) {
		
		int count = 0;
		
		for(int i=0;i<countTo;i++) {
			count = count + i;
			
		}
		
		System.out.println("Sum upto: "+countTo+" is ==>"+count
				+ " called by "+Thread.currentThread().getName());
		
	}

}
