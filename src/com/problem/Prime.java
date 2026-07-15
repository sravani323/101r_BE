package com.problem;

public class Prime {

	public boolean isprime(int n) {
		 if (n <= 1) {
	            return false;
	        }
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
      Prime obj=new Prime();
      System.out.println(obj.isprime(3));
	}

}
