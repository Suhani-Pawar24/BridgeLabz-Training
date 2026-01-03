package com.inheritance.heirarchicalinheritance.bankaccounttypes;

public class BankAccount 
{
	protected String accountNumber;
    protected double balance;
    
    
	public BankAccount(String accountNumber, double balance) 
	{
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayCommonDetails()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }

}
