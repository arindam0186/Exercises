package com.practice.day3_polymorphism;

public class Musician extends ServiceProvider {

	private String instrument;
	private String location;
	public String getInstrument() {
		return instrument;
	}
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Musician(long phoneNumber, String firstName, String instrument, String location) {
		super(phoneNumber, firstName);
		this.instrument = instrument;
		this.location = location;
	}
	@Override
	public double calculateFees() {
		// TODO Auto-generated method stub
		
		double fees = 1000;
		
		if(this.instrument.equalsIgnoreCase("Guitar") || this.location.equalsIgnoreCase("Delhi")) {
			
		}
		return fees;
	}
	
}
