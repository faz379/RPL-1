#ifndef USER_H
#define USER_H

class User {

private:
	HospitalManagementSystem system;
	std::vector<Report> report;
	int ID;
	int userID;
	string username;
	string password;

public:
	void login();

	void logout();
};

#endif
