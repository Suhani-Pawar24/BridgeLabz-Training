package com.encapsulation.bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable 
{
		
		SavingsAccount(int accountNumber,String holderName,double balance)
		{
			super(accountNumber,holderName,balance);
		}
		public void applyForLoan()
		{
			if(calculateLoanEligibility())
			{
				System.out.println("Applied");
			}
			else 
			{
				System.out.println("Not eligible");
			}
			
		}
		public boolean calculateLoanEligibility()
		{
			if(balance>=150000) 
			{
				return true;
			}
			else return false;
			
		}
		double calculateInterest()
		{
			return balance*(3.25/100);
		}
}


