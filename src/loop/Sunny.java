package loop;

import java.util.*;


public class Sunny {

	public boolean isSunny(int n) {
		int num=n+1;
		int  root=(int)Math.sqrt(num);
		return root*root==num;
	}
	
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    Sunny obj=new Sunny();
    System.out.println(obj.isSunny(n)?"Sunny":"!sunny");
    sc.close();
    
	}

}
