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

	@Override
	public boolean addDoctor(Appointment appointments, Doctor doctor) {
		// TODO Auto-generated method stub
		
		HashMap<Doctor, Set<Patient>> register = appointments.getRegister();
		register.put(doctor, null);
		
		return false;
	}

	@Override
	public boolean addPatient(Appointment appointments, Doctor doctor, Patient patient) {
		// TODO Auto-generated method stub
		
		HashMap<Doctor, Set<Patient>> register = appointments.getRegister();
		
		if(register.containsKey(doctor) && register.get(doctor) != null) {
			Set<Patient> patients = register.get(doctor);
			patients.add(patient);
			register.put(doctor, patients);
		}
		else {
			Set<Patient> patients = new HashSet<Patient>();
			patients.add(patient);
			register.put(doctor,patients);
		}
		return false;
	}

	@Override
	public Set<Patient> returnPatientList(Appointment appointments, String doctorName) {
		// TODO Auto-generated method stub
		
		HashMap<Doctor, Set<Patient>> register = appointments.getRegister();

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
	public Set<Patient> cancelAppointment(Appointment appointments, Doctor doctor, Patient patient) {
		// TODO Auto-generated method stub
		
		HashMap<Doctor, Set<Patient>> register = appointments.getRegister();
		
		Set<Patient> patients = register.get(doctor);
		
		patients.remove(patient);
		
		return patients;
	}

}
