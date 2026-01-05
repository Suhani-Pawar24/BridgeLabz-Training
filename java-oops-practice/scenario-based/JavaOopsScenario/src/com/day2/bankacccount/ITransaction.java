package com.day2.bankacccount;

public interface ITransaction {
	    void deposit(double amount);
	    void withdraw(double amount);
	    double checkBalance();
	}

