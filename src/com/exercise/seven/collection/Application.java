package com.exercise.seven.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.exercise.seven.collection.entity.Appointment;
import com.exercise.seven.collection.entity.Doctor;
import com.exercise.seven.collection.entity.Patient;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Doctor, Set<Patient>> map = new HashMap<Doctor, Set<Patient>>();
		
		Appointment appointments = new Appointment(map);
		
		ManageAppointments manager = new ManageAppointments();
		
		Doctor raj = new Doctor(1, "RAJESH");
		
		Patient ari = new Patient(101, "Arindam");
		Patient john = new Patient(102, "John");
		
		manager.addDoctor(appointments, raj);
		
		manager.addPatient(appointments, raj, ari);
		manager.addPatient(appointments, raj, john);
		
		
		System.out.println("Patient list of "+raj.getDoctorName()+" ==> ");
		Set<Patient> patientList = manager.returnPatientList(appointments, "Rajesh");
		
		Iterator<Patient> iterator = patientList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		manager.cancelAppointment(appointments, raj, john);
		
		System.out.println("New patient list of "+raj.getDoctorName()+" ==> ");
		
		Set<Patient> patientListNew = manager.returnPatientList(appointments, "Rajesh");
		
		Iterator<Patient> iteratorNew = patientListNew.iterator();
		
		while(iteratorNew.hasNext()) {
			System.out.println(iteratorNew.next());
		}
	}

}
