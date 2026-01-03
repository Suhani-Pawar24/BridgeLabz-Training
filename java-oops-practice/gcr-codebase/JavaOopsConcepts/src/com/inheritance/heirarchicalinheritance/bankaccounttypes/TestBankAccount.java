package com.inheritance.heirarchicalinheritance.bankaccounttypes;

public class TestBankAccount
{
	    public static void main(String[] args) 
	    {
	        SavingsAccount sa = new SavingsAccount("SA101", 50000.0, 4.5);
	        CheckingAccount ca = new CheckingAccount("CA202", 20000.0, 10000.0);
	        FixedDepositAccount fda = new FixedDepositAccount("FD303", 100000.0, 5);

	        System.out.println("--- Banking System Details ---\n");
	        
	        sa.displayAccountType();
	        System.out.println("---------------------------");
	        
	        ca.displayAccountType();
	        System.out.println("---------------------------");
	        
	        fda.displayAccountType();
	    }
}
