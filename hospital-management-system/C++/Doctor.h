#ifndef DOCTOR_H
#define DOCTOR_H

class Doctor : User {

private:
	HospitalManagementSystem system;
	std::vector<Patient> patient;
	std::vector<Appointment> appoint;
	std::vector<Room> room;
	std::vector<Medication> medication;
	int doctorID;
	string name;
	string specialization;

public:
	void addPatientNotes(Patient patient, string notes);

	void prescribeMedication(Patient patient, Medication medication);

	void viewAppointments(Appointment appointments);
};

#endif
