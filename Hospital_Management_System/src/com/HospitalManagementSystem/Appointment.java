package com.HospitalManagementSystem;

import java.util.Date;

public class Appointment {
	private int id;
	private int patientId;
	private String doctorName;
	private Date appointmentDate;

	public Appointment(int id, int patientId, String doctorName, Date appointmentDate) {
		this.id = id;
		this.patientId = patientId;
		this.doctorName = doctorName;
		this.appointmentDate = appointmentDate;
	}

	@Override
	public String toString() {
		return "Appointment ID: " + id + ", Patient ID: " + patientId + ", Doctor: " + doctorName + ", Date: "
				+ appointmentDate;
	}

}
