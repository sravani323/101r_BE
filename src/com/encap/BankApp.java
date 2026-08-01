package com.encap;
import java.util.*;

public class BankApp {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter the Account Number:");
   int account_num=sc.nextInt();
   System.out.println("Enter the Account Holder:");
   String account_name=sc.next();
   System.out.println("Enter the Balance:");
   double balance=sc.nextDouble();
   BankAccount obj=new BankAccount();
   obj.setAccount_num(account_num);
   obj.setAccount_name(account_name);
   obj.setSalary(balance);
   System.out.println("Account Number:"+obj.getAccount_num());
   System.out.println(" Account Holder:"+obj.getAccount_name());
   System.out.println("balance:"+obj.getSalary());
   
   
	}

}
