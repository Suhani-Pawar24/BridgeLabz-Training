package com.constructor.level1;
public class SavingsAccount extends BankAccount
{
	public SavingsAccount(int accountNumber, String accountHolder, double balance)
	{
		super(accountNumber,accountHolder,balance);
	}

	public void displayDetails()
	{
		System.out.println("Account number: " + accountNumber);
		System.out.println("Account holder: " + accountHolder);
		System.out.println("Balance : " + getBalance());
	}

	public static void main(String[] args)
	{
		SavingsAccount obj = new SavingsAccount(1234, "Aditya", 30000);
		obj.displayDetails();
		
		obj.setBalance(50000);
		System.out.println("Updated Balance: " + obj.getBalance());
	}
}	