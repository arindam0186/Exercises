package com.practice.six.multithreading;
import java.io.IOException;

public class ThreadJoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Thread Starting");
		
		Thread thread = new Thread() {

			{
				System.out.println("Joining thread starts");
			}
			@Override
			public void run() {

				try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Joining thread finishes");
			}
			
		};
		
		System.out.println("Thread Starts");
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Main finished");
	}

}
