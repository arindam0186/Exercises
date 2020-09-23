package com.exercise.seven.collection.ifaces;

import java.util.HashMap;
import java.util.Set;

import com.exercise.seven.collection.entity.Appointment;
import com.exercise.seven.collection.entity.Doctor;
import com.exercise.seven.collection.entity.Patient;

public interface HospitalServices {

	public boolean addDoctor(Appointment appointments, Doctor doctor);
	
	public boolean addPatient(Appointment appointments, Doctor doctor, Patient patient);
	
	public Set<Patient> returnPatientList(Appointment appointments, String doctorName);
	
	public Set<Patient> cancelAppointment(Appointment appointments, Doctor doctor, Patient patient);
	
}
