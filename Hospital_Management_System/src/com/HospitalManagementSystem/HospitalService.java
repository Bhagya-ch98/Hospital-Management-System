package com.HospitalManagementSystem;

import java.util.*;

public class HospitalService {
	private Map<Integer, Patient> patients = new HashMap<>();
	private List<Appointment> appointments = new ArrayList<>();
	private int patientCounter = 1;
	private int appointmentCounter = 1;

	// Patient Registration
	public void registerPatient(String name, int age, String contact, String medicalHistory) {
		Patient patient = new Patient(patientCounter++, name, age, contact, medicalHistory);
		patients.put(patient.getId(), patient);
		System.out.println("Patient Registered Successfully: " + patient);
	}

	// Schedule Appointment
	public void scheduleAppointment(int patientId, String doctorName, Date appointmentDate) {
		if (!patients.containsKey(patientId)) {
			System.out.println("Error: Patient ID not found!");
			return;
		}
		Appointment appointment = new Appointment(appointmentCounter++, patientId, doctorName, appointmentDate);
		appointments.add(appointment);
		System.out.println("Appointment Scheduled: " + appointment);
	}

	// View Patients
	public void listPatients() {
		if (patients.isEmpty()) {
			System.out.println("No patients found.");
			return;
		}
		patients.values().forEach(System.out::println);
	}

	// View Appointments
	public void listAppointments() {
		if (appointments.isEmpty()) {
			System.out.println("No appointments scheduled.");
			return;
		}
		appointments.forEach(System.out::println);
	}

	// Billing Module
	public void generateBill(int patientId, double consultationFee, double treatmentFee) {
		if (!patients.containsKey(patientId)) {
			System.out.println("Error: Patient ID not found!");
			return;
		}
		double total = consultationFee + treatmentFee;
		System.out.println("Generating Bill...");
		System.out.println("Patient: " + patients.get(patientId).getName());
		System.out.println("Consultation Fee: $" + consultationFee);
		System.out.println("Treatment Fee: $" + treatmentFee);
		System.out.println("Total Bill: $" + total);
	}

}
