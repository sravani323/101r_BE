package Test;

import java.util.*;

public class ugly {
	public boolean uglynumber(int num) {
		while(num%2==0) {
			num=num/2;
		}
		while(num%3==0) {
			num=num/3;
		}
		while(num%5==0) {
			num=num/5;
		}
		return num==1;
	}
public static void main(String args[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number:");
	int n=sc.nextInt();
	ugly obj=new ugly();
	System.out.println(	obj.uglynumber(n));
	sc.close();
 }
}
