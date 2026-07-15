package loop;


import java.util.*;

public class Armstrong {
	public boolean arm(int n) {
		int temp=n;
		int num=n;
		int digits=0;
		while(temp>0) {
			digits++;
			temp=temp/10;
		}
		int sum=0;
		while(num>0) {
			int digit=num%10;
			sum+=(int)Math.pow(digit,digits);
			num=num/10;
		}
		return n==sum;
	}

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:");
    int n=sc.nextInt();
    Armstrong obj=new Armstrong();

    System.out.println(obj.arm(n));
    
	}

}
