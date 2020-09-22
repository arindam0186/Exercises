package com.practice.six.multithreading;

public class UsePrintString implements Runnable {
	
	private String string1;
	private String string2;
	
	

	public UsePrintString(String string1, String string2) {
		super();
		this.string1 = string1;
		this.string2 = string2;
		
		Thread thread = new Thread(this);
		thread.start();
		
	}



	@Override
	public void run() {

		PrintStrings.print(string1, string2);
		
	}

}
