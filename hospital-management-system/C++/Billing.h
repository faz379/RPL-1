#ifndef BILLING_H
#define BILLING_H

class Billing {

private:
	Patient patient;
	int ID;
	int billID;
	int amount;

public:
	void generateBill();

	void processPayment();
};

#endif
