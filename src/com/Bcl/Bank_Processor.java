package com.Bcl;
import java.util.*;

public class Bank_Processor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the ID:");
		int empid=sc.nextInt();
		System.out.print("Enter the account Holder:");
		String name=sc.next();
		System.out.print("Enter the balance");
		double balance=sc.nextDouble();
		
		Bank_Account obj=new Bank_Account(empid,name,balance);
		
		System.out.println("Bank Balance:"+obj.getBalance());
		
		 System.out.println("-------------------------- ");
		 System.out.print("Enter the desposit:");
		 double desposit=sc.nextDouble();
		obj.desposit(desposit);
		System.out.println("Balance  : " + obj.getBalance());
		
		 System.out.println("--------------------");
		 System.out.print("enter the withdrawal:");
		 double wtd=sc.nextDouble();

        obj.withdraw(wtd);

        System.out.println("Balance : " + obj.getBalance());
		
	}

}
