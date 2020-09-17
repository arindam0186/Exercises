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
		String nameOfAppliances[] = new String[2];
		int count = 0;
		
		do {
			
			System.out.print("Enter Appliance you want to buy(1/2) ==> ");
			int key = Integer.parseInt(sc.next());
			if(key>2) {
				System.out.println("Check your input");
				continue;
			}
			System.out.print("For how many days? ");
			int days = Integer.parseInt(sc.next());
			Appliances selected = john.getProduct(key, days);
			totalRent+= john.getRent(selected);
			nameOfAppliances[count++] = john.getName(selected);
			
			System.out.print("Do you wish to buy more Appliances? ");
			proceed = sc.next();
			
		}
		while(proceed.equalsIgnoreCase("Yes"));
		System.out.print("Appliances bought ==> ");
		for(String appliance: nameOfAppliances) {
			System.out.print(appliance+" ");
		}
		System.out.println();

		System.out.println("Total Rent ==> "+totalRent);
		
		System.out.println();
		System.out.println("*********Thank You*********");
		sc.close();

	}

}
