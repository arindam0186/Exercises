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
		
		NewShowRoom johnCars = new NewShowRoom();
		

		int key = Integer.parseInt(args[0]);
		Automobile selected = johnCars.getProduct(key);
		johnCars.printEstimate(selected);
		
		Scanner sc = new Scanner(System.in);
		
		String ch = sc.next();
		
		System.out.println(ch);
		
		sc.close();
		
	}

}
