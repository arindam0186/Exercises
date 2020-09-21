package com.exercise.five.serialization;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		BusinessService service = new BusinessService();
		
		CreditCard[] cards = new CreditCard[3];
		
		cards[0] = new CreditCard(101,"John",2000);
		cards[1] = new CreditCard(102,"Harry",3000);
		cards[2] = new CreditCard(103,"Ram",4000);
		
		System.out.print("Do you want to store Object(1) or Character(2)? ");
		int type = sc.nextInt();
		
		System.out.print("Do you want to give any Path?(1/0) ");
		
		int isPath = sc.nextInt();
		String path = "";
		if(isPath == 1) {
			System.out.print("Enter Path==> ");
			path=sc.next();

		}
		boolean result;
		
		if(isPath == 1) {
			result = service.store(cards, path, type);
			}
		else {
			result = service.store(cards, type);
		}
		
		if(result) {
			System.out.println("Book Persisted");
		}
		else {
			System.out.println("Error - Check");
		}
		CreditCard[] newCards = null;
		if(isPath == 1) {
			newCards = service.retrieve(path, type);
			for(CreditCard newCard: newCards) {
				System.out.println(newCard);
			}
		}
		else {
			newCards = service.retrieve(type);
			for(CreditCard newCard: newCards) {
				System.out.println(newCard);
			}
		}
		
		CreditCard[] updatedCards = service.deleteFromFile(cards, "John");
		for(CreditCard card: updatedCards) {
			System.out.println("*"+card);
		}
	}
}
