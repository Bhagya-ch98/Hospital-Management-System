package com.HospitalManagementSystem;

public class Patient {
	private int id;
	private String name;
	private int age;
	private String contact;
	private String medicalHistory;

	public Patient(int id, String name, int age, String contact, String medicalHistory) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.medicalHistory = medicalHistory;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMedicalHistory() {
		return medicalHistory;
	}

	@Override
	public String toString() {
		return "Patient ID: " + id + ", Name: " + name + ", Age: " + age + ", Contact: " + contact
				+ ", Medical History: " + medicalHistory;
	}

}
