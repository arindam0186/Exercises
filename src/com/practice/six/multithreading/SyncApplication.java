package com.practice.six.multithreading;

public class SyncApplication {

	public static void main(String[] args) {

		new UsePrintString("Idli", "Sambhar");
		new UsePrintString("Parantha", "Dahi");
		new UsePrintString("Pizza", "Coke");
		new UsePrintString("Tea", "Biscuit");
		
		
	}

}
