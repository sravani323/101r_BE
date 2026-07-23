package com.Bcl;

public class Bank_Processor {

	public static void main(String[] args) {
		Bank_Account obj=new Bank_Account(123,"sravani",30000);
		System.out.println("Bank number:"+obj.getAccountNumber());
		System.out.println("Bank Holder:"+obj.getAccountHolder());
		System.out.println("Bank Balance:"+obj.getBalance());
		
		 System.out.println(" Deposit Operations ");
		obj.desposit(1000);
		System.out.println("Balance  : " + obj.getBalance());
		
		 System.out.println(" Withdrawal Operations ");

        obj.withdraw(5000);

        System.out.println("Balance : " + obj.getBalance());
		
	}

}
