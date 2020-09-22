package com.practice.six.multithreading;

public class PrintStrings {

	public synchronized static void print(String str1, String str2) {
		
		System.out.print(str1+" - ");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.print(str2);
		
		System.out.println();
		
	}
}
