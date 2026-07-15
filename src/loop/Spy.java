package loop;

import java.util.*;

public class Spy {
	public boolean isSpy(int n) {
		int num=n;
		int sum=0;
		int product=1;
		while(num>0) {
			int digit=num%10;
			sum+=digit;
			product=product*digit;
			num=num/10;
		}
		return sum==product;
	}

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:");
    int n=sc.nextInt();
    Spy obj=new Spy();
    System.out.println(obj.isSpy(n)?"spy number":"!spy number");
    sc.close();
	}

}
