package com.practice.four.exceptionHandling;

public class CustomerService {

	public String generateUserId(Customer cust) {
		try {
			int firstPart = Integer.parseInt(cust.getCustomerId());
			String secondPart = cust.getEmail().substring(0,4);
			return firstPart+secondPart;
			
		} 
		catch (NumberFormatException e) {
			System.err.println("Customer ID should be a number");
//			e.printStackTrace();
		}
		return "";
	}
	
	public void printCustomer(Customer cust) {

		try {
			System.out.println(cust.getCustomerName().length());
		} catch (NullPointerException e) {
			System.err.println("Customer Name should not be empty");
//			e.printStackTrace();
		}
		System.out.println("Outside catch block");
	}
	
	public String encryptEmail(Customer cust) {
		
		String email = cust.getEmail();
		
		boolean status = email.contains("@");
		
		String encrypted = null;
		if(!status) {
			try {
				throw new Exception("Invalid Email Id");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			finally {
				System.err.println("Inside finally block");
			}
			System.out.println("Outside finally block");
		}
		else {
			encrypted = "abcde"+email+"!4341@";
		}
		return encrypted;
	}
}
