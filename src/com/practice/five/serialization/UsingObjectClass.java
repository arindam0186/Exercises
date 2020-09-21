package com.practice.five.serialization;
public class UsingObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book headFirst1 = new Book(100, "Head First Java", "Kathy Sierra", 450.00);
		Book headFirst2 = new Book(100, "Head First Java", "Kathy Sierra", 450.00);
		
		System.out.println(headFirst1.equals(headFirst2));
		
		Book headFirst3 = headFirst2;
		
		System.out.println(headFirst2.equals(headFirst3));
	}

}
