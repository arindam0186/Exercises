package com.exercise.seven.collection.entity;

import java.util.HashMap;
import java.util.Set;

public class Appointment {
	
	private String date;
	private HashMap<Doctor, Set<Patient>> register;

	public Appointment(String date) {
		super();
		this.date = date;
		this.register = new HashMap<Doctor, Set<Patient>>();
	}

	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public HashMap<Doctor, Set<Patient>> getRegister() {
		return register;
	}

	public void setRegister(HashMap<Doctor, Set<Patient>> register) {
		this.register = register;
	}
	

}
