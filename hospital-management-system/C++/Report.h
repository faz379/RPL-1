#ifndef REPORT_H
#define REPORT_H

class Report {

private:
	User user;
	int ID;
	int reportID;
	string content;

public:
	void generateReport();
};

#endif
