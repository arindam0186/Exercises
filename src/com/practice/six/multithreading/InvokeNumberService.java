package com.practice.six.multithreading;

public class InvokeNumberService implements Runnable {

	
	private int countUpTo;
	private String threadName;
	
	private NumberService service;
	
	public InvokeNumberService() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public InvokeNumberService(int countUpTo, String threadName) {
		super();
		this.countUpTo = countUpTo;
		this.threadName = threadName;
		
		service = new NumberService();
		
		Thread thread = new Thread(this, threadName);
		thread.start();
	}

	@Override
	public void run() {

		this.service.sumNumbers(countUpTo);
		
	}

}
