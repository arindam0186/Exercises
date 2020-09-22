package com.practice.six.multithreading;

import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName());
		
		new InvokeNumberService(100, "HundredCount");
		new InvokeNumberService(1000, "ThousandCount");
		new InvokeNumberService(10000, "TenThousandCount");
		
		try {
			
			System.out.println("Enter a message");
			System.in.read();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
