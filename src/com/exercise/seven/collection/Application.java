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
		
		String date = "23/09/2020";

		ManageAppointments manager = new ManageAppointments(date);
		
		Doctor raj = new Doctor(1, "RAJESH");
		
		Patient ari = new Patient(101, "Arindam");
		Patient john = new Patient(102, "John");
		
		manager.addDoctor(raj);
		
		manager.addPatient(raj, ari);
		manager.addPatient(raj, john);
		
		
		System.out.println("Patient list of "+raj.getDoctorName()+" ==> ");
		Set<Patient> patientList = manager.getPatientList("Rajesh");
		
		Iterator<Patient> iterator = patientList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		manager.cancelAppointment(raj, john);
		
		System.out.println("New patient list of "+raj.getDoctorName()+" ==> ");
		
		Set<Patient> patientListNew = manager.getPatientList("Rajesh");
		
		Iterator<Patient> iteratorNew = patientListNew.iterator();
		
		while(iteratorNew.hasNext()) {
			System.out.println(iteratorNew.next());
		}
	}

}
