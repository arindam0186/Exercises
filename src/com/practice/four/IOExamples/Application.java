package com.practice.four.IOExamples;

import java.io.File;
import java.io.IOException;

import com.practice.four.exceptionHandling.Customer;

public class Application {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Customer ramesh = new Customer("101","Ramesh",51616,"ramesh@abc.com");
		
		FilesExample service = new FilesExample();
		service.writeToFile(new File("Customer.txt"), ramesh);

		System.out.println("Done");
		
		service.readFromFile(new File("Customer.txt"));
	}

}
