package com.exercise.three;

import java.util.Scanner;

import com.exercise.three.ifaces.Appliances;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Customer john = new Customer();
		
		String proceed = "Yes";
		double totalRent = 0.0;
		String nameOfAppliances = "";
		
		do {
			
			System.out.print("Enter Appliance you want to buy(1/2) ==> ");
			int key = Integer.parseInt(sc.next());
			Appliances selected = john.getProduct(key);
			totalRent+= john.getRentPerDay(selected);
			nameOfAppliances+= john.getName(selected)+" ";
			
			System.out.print("Do you wish to buy more Appliances? ");
			proceed = sc.next();
			
		}
		while(proceed.equalsIgnoreCase("Yes"));
		System.out.println("Appliances bought ==>"+nameOfAppliances);
		System.out.println("Total Rent ==> "+totalRent);
		System.out.println();
		System.out.println("*********Thank You*********");
		sc.close();

	}

}
