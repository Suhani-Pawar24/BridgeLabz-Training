package com.encapsulation.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable 
{
		CurrentAccount(int accountNumber,String holderName,double balance)
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
			if(balance>=250000)
			{
				return true;
			}
			else return false;
			
		}
		double calculateInterest()
		{
			return balance*(0.75/100);
		}

}
