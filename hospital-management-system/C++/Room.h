#ifndef ROOM_H
#define ROOM_H

class Room {

private:
	HospitalManagementSystem system;
	std::vector<Patient> patient;
	std::vector<Doctor> doctor;
	int ID;
	int roomID;
	string roomType;

public:
	void admitPatient(Patient patient);
};

#endif
