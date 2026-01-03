package com.inheritance.heirarchicalinheritance.bankaccounttypes;

public class CheckingAccount extends BankAccount
{
	
		private double withdrawalLimit;

	    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) 
	    {
	        super(accountNumber, balance);
	        this.withdrawalLimit = withdrawalLimit;
	    }

	    public void displayAccountType() 
	    {
	        System.out.println("Account Type: Checking Account");
	        displayCommonDetails();
	        System.out.println("Daily Withdrawal Limit: ₹" + withdrawalLimit);
	    }
}

