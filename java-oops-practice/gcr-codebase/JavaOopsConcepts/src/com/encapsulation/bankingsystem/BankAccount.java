package com.encapsulation.bankingsystem;

public abstract class BankAccount 
{
		private int accountNumber;
		private String holderName;
		protected double balance;
		
		BankAccount(int accountNumber,String holderName,double balance)
		{
			this.accountNumber = accountNumber;
			this.holderName = holderName;
			this.balance = balance;
			
		}
		abstract double  calculateInterest();
		
		String getName() 
		{
			return holderName;
		}
		double getBalance() 
		{
			return balance;
		}
		void setBalance()
		{
			this.balance = balance;
		}
		void deposit(double amount)
		{
			this.balance += amount;
		}
		void withdraw(double amount) 
		{
			if(balance >=0 && balance >amount) 
			{
				balance -= balance;
			}
			else 
			{
				System.out.println("Invalid amount");
			}
		}
		
		void display() 
		{
			System.out.println("Holder name :"+ holderName);
		}
		
}


