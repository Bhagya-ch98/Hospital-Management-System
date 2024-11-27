package com.HospitalManagementSystem;

import java.text.SimpleDateFormat;
import java.util.*;

public class HospitalManagementSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HospitalService service = new HospitalService();

		System.out.println("Welcome to the Hospital Management System!");

		while (true) {
			System.out.println("\nMain Menu:");
			System.out.println("1. Register Patient");
			System.out.println("2. Schedule Appointment");
			System.out.println("3. View Patients");
			System.out.println("4. View Appointments");
			System.out.println("5. Generate Bill");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter Patient Name: ");
				String name = scanner.nextLine();
				System.out.print("Enter Patient Age: ");
				int age = scanner.nextInt();
				scanner.nextLine(); // Consume newline
				System.out.print("Enter Contact Number: ");
				String contact = scanner.nextLine();
				System.out.print("Enter Medical History: ");
				String medicalHistory = scanner.nextLine();
				service.registerPatient(name, age, contact, medicalHistory);
				break;
			case 2:
				System.out.print("Enter Patient ID: ");
				int patientId = scanner.nextInt();
				scanner.nextLine(); // Consume newline
				System.out.print("Enter Doctor Name: ");
				String doctorName = scanner.nextLine();
				System.out.print("Enter Appointment Date (dd-MM-yyyy): ");
				String dateInput = scanner.nextLine();
				try {
					Date appointmentDate = new SimpleDateFormat("dd-MM-yyyy").parse(dateInput);
					service.scheduleAppointment(patientId, doctorName, appointmentDate);
				} catch (Exception e) {
					System.out.println("Invalid date format!");
				}
				break;
			case 3:
				service.listPatients();
				break;
			case 4:
				service.listAppointments();
				break;
			case 5:
				System.out.print("Enter Patient ID: ");
				int billPatientId = scanner.nextInt();
				System.out.print("Enter Consultation Fee: ");
				double consultationFee = scanner.nextDouble();
				System.out.print("Enter Treatment Fee: ");
				double treatmentFee = scanner.nextDouble();
				service.generateBill(billPatientId, consultationFee, treatmentFee);
				break;
			case 6:
				System.out.println("Exiting system. Thank you!");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}

		}
	}

}
