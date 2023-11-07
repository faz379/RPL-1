#ifndef APPOINTMENT_H
#define APPOINTMENT_H

class Appointment {

private:
	HospitalManagementSystem system;
	std::vector<Patient> patient;
	std::vector<Doctor> doctor;
	int ID;
	int appointmentID;
	int dateTime;

public:
	void cancelAppointment();
};

#endif
