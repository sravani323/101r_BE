package com.Bcl;

public class Bank_Account {
	int accountNumber;
	String accountHolder;
	double balance;
	public Bank_Account(int accountNumber,String accountHolder,double balance) {
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
public void desposit(double amount) {
	if(amount>0) {
	balance=balance+amount;
	}
	else {
		System.out.println("Amount less than 0");
	}
}
public void withdraw(double amount) {
	 if (amount <= 0) {
	        System.out.println("Withdrawal amount must be greater than 0");
	    } else if (balance >= amount) {
	        balance = balance - amount;
	    } else {
	        System.out.println("Insufficient balance");
	    }
}
}
