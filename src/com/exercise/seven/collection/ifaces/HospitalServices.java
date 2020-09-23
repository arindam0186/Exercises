package com.exercise.seven.collection.ifaces;

import java.util.HashMap;
import java.util.Set;

import com.exercise.seven.collection.entity.Appointment;
import com.exercise.seven.collection.entity.Doctor;
import com.exercise.seven.collection.entity.Patient;

public interface HospitalServices {

	public boolean addDoctor(Doctor doctor);
	
	public boolean addPatient(Doctor doctor, Patient patient);
	
	public Set<Patient> getPatientList(String doctorName);
	
	public Set<Patient> cancelAppointment(Doctor doctor, Patient patient);
	
}
