#ifndef PATIENT_H
#define PATIENT_H

class Patient {

private:
	HospitalManagementSystem system;
	std::vector<Billing> bill;
	std::vector<Appointment> appoint;
	Room room;
	std::vector<Doctor> doctor;
	int ID;
	int patientID;
	string name;
	int dateOfBirth;
	string contactNumber;

public:
	void registerPatient();

	void scheduleAppointment(Doctor doctor);

	void admitToRoom(Room room);
};

#endif
