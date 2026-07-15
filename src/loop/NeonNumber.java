package loop;

import java.util.*;

public class NeonNumber {

	public boolean isNeon(int n) {
		int square=n*n;
		int sum=0;
		while(square>0) {
			int digit=square%10;
			sum+=digit;
			square=square/10;
		}
		return n==sum;
	}
	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the number:");
   int n=sc.nextInt();
   NeonNumber obj=new NeonNumber();
   System.out.print(obj.isNeon(n));
   sc.close();
	}

}
