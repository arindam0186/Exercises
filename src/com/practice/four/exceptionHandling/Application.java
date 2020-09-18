package com.practice.four.exceptionHandling;

import com.practice.four.exceptionHandling.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Customer ram = new Customer();
			
			ram.setCustomerId("100");
			ram.setEmail("ram@ram.com");
			ram.setMobileNumber(1234);
			ram.setCustomerName("Ramesh");
			
			CustomerService service = new CustomerService();
			service.printCustomer(ram);
			System.out.println(service.generateUserId(ram));
			
			Customer shyam = new Customer();
			
			shyam.setCustomerId("123");
			shyam.setEmail("shyam@shyam.com");
			shyam.setMobileNumber(6782229);
			shyam.setCustomerName("Shyameshwar");
			
			System.out.println(service.generateUserId(shyam));
			
			System.out.println(service.encryptEmail(shyam));
			
		} 
		catch(RangeCheckException e) {
			System.err.println(e.getMessage());
		}
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
//			e.printStackTrace();
		}
	}

}
