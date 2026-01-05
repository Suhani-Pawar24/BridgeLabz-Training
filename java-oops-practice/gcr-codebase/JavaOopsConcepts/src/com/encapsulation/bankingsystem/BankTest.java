package com.encapsulation.bankingsystem;

public class BankTest 
{

		public static void main(String[] args) 
		{
			BankAccount[] b = new BankAccount[2];
			
			b[0] = new SavingsAccount(1234085,"Suhani",30000);
			b[1] = new CurrentAccount(12999021,"Aditya", 500000);
			
			for(BankAccount bb : b) 
			{
				System.out.println("Name   :"+bb.getName());
				System.out.println("Balance   :"+bb.getBalance());
				
				System.out.println("Intrest on current balance :"+bb.calculateInterest());
				
				
				
				if(bb instanceof Loanable)
				{
					((Loanable) bb).applyForLoan();
				}
				
			}

		}

}


