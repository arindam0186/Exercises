package com.practice.day3_polymorphism;

public abstract class ServiceProvider {

	private long phoneNumber;
	private String firstName;
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public ServiceProvider(long phoneNumber, String firstName) {
		super();
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
	}
	public abstract double calculateFees();
}
