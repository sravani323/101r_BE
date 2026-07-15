package loop;
import java.util.*;
public class StrongNumber {
	public boolean isStrong(int n) {
		int num=n;
		int sum=0;
		while(num>0) {
			int digit=num%10;
			sum+=fact(digit);
			num=num/10;
		}
		return sum==n;
	}
	public static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    
    StrongNumber obj=new StrongNumber();
    System.out.println(obj.isStrong(n));
    
    
    sc.close();
	}

}
