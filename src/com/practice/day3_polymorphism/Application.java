package com.practice.day3_polymorphism;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lawyer rajesh = new Lawyer(494949, "Rajesh Khanna", "HighCourt", "B.L");
		Musician sharma = new Musician(251561, "Umesh Sharma", "Shenoy", "Allahabad");
		
		Billing bill = new Billing();
		bill.printFees(sharma);
		bill.printFees(rajesh);
	}

}
