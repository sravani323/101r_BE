package com.problem;

public class Example {
	public boolean print(int n) {
		int num=n;
		int temp=n;
		int digit=0;
		while(num>0) {
			digit++;
			num=num/10;
		}
		int sum=0;
		while(temp>0) {
			int digits=temp%10;
			sum+=(int)Math.pow(digits, digit);
			temp=temp/10;
		}
		return n==sum;
	}

	public static void main(String[] args) {
     Example obj=new Example();
     System.out.println(obj.print(1634));
	}

}
