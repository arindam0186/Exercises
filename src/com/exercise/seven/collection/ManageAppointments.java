package com.exercise.seven.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.exercise.seven.collection.entity.Appointment;
import com.exercise.seven.collection.entity.Doctor;
import com.exercise.seven.collection.entity.Patient;
import com.exercise.seven.collection.ifaces.HospitalServices;

public class ManageAppointments implements HospitalServices {

	private HashMap<Doctor, Set<Patient>> register;
	private String date;
	
	public ManageAppointments(String date) {
		super();
		// TODO Auto-generated constructor stub
		Appointment appointments = new Appointment(date);
		register = appointments.getRegister();
		date = appointments.getDate();
	}

	@Override
	public boolean addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		
		if(register!=null) {
			register.put(doctor, null);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean addPatient(Doctor doctor, Patient patient) {
		// TODO Auto-generated method stub
		
		if(register == null) {
			return false;
		}
		if(register.containsKey(doctor) && register.get(doctor) != null) {
			Set<Patient> patients = register.get(doctor);
			patients.add(patient);
			register.put(doctor, patients);
			return true;
		}
		else {
			Set<Patient> patients = new HashSet<Patient>();
			patients.add(patient);
			register.put(doctor,patients);
			return true;
		}
	}

	@Override
	public Set<Patient> getPatientList(String doctorName) {
		// TODO Auto-generated method stub
		
		Set<Map.Entry<Doctor, Set<Patient>>> set = register.entrySet();
		
		for(Map.Entry<Doctor, Set<Patient>> eachEntry: set) {
			Doctor doctor = eachEntry.getKey();
			if(doctor.getDoctorName().equalsIgnoreCase(doctorName)) {
				return eachEntry.getValue();
			}
		}
		return null;
	}

	@Override
	public Set<Patient> cancelAppointment(Doctor doctor, Patient patient) {
		// TODO Auto-generated method stub
			
		Set<Patient> patients = register.get(doctor);
		
		patients.remove(patient);
		
		return patients;
	}

}
