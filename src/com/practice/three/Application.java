package com.practice.three;

import java.util.Scanner;

import com.practice.three.ifaces.Automobile;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		ShowRoom saiCars = new ShowRoom();
//		
//		int key = Integer.parseInt(args[0]);
//		Automobile selected = saiCars.getProduct(key);
//		saiCars.printEstimate(selected);
		
		Scanner sc = new Scanner(System.in);

		NewShowRoom johnCars = new NewShowRoom();
		
		String proceed = "Yes";
		
		do {
			
			System.out.print("Enter Automobile Preference ==> ");
			int key = Integer.parseInt(sc.next());
			Automobile selected = johnCars.getProduct(key);
			johnCars.printEstimate(selected);
			
			System.out.print("Do you wish to continue? ");
			proceed = sc.next();
			
		}
		while(proceed.equalsIgnoreCase("Yes"));
		
		System.out.println();
		System.out.println("*********Thank You*********");
		sc.close();
		
	}

}
