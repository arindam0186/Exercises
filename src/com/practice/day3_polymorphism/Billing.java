package com.practice.day3_polymorphism;

public class Billing {

	public void printFees(ServiceProvider provider) {
		System.out.println(provider.calculateFees());
	}
}
