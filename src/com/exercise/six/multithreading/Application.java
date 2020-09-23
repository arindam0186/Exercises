package com.exercise.six.multithreading;

import java.io.File;

public class Application {

	public static void main(String[] args) {

		BankAccount account = new BankAccount(101, "Arindam", 1000.00);
		
		InvokeBankAccount invoke = new InvokeBankAccount();
		
		Thread thread1 = new Thread() {
			public void run() {
				invoke.writeToFile(new File("Account.txt"), account);
			}
		};
		thread1.start();
		System.out.println("Write Thread Complete");
		
		Thread thread2 = new Thread() {
			public void run() {
				invoke.readFromFile(new File("Account.txt"));
			}
		};
		thread2.start();
		System.out.println("Read Thread Complete");
		
	}

}
