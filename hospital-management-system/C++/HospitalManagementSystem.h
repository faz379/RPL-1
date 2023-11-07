#ifndef HOSPITALMANAGEMENTSYSTEM_H
#define HOSPITALMANAGEMENTSYSTEM_H

class HospitalManagementSystem {

private:
	std::vector<Patient> patient;
	std::vector<Doctor> doctor;
	std::vector<Room> room;
	std::vector<Medication> medic;
	std::vector<Appointment> appoint;
	std::vector<User> user;
	int ID;
	Doctor doctors;
	Patient patients;
	Room rooms;
	Medication medications;
	Appointment appointments;

public:
	void addPatient(Patient patient);

	void addDoctor(Doctor doctor);
};

#endif
