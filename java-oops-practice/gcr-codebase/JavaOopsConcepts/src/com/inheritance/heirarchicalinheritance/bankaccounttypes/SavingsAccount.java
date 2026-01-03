package com.inheritance.heirarchicalinheritance.bankaccounttypes;

public class SavingsAccount extends BankAccount 
{
	    private double interestRate;

	    public SavingsAccount(String accountNumber, double balance, double interestRate) {
	        super(accountNumber, balance);
	        this.interestRate = interestRate;
	    }

	    public void displayAccountType() {
	        System.out.println("Account Type: Savings Account");
	        displayCommonDetails();
	        System.out.println("Interest Rate: " + interestRate + "%");
	    }
}


