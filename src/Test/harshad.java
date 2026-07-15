package Test;
import java.util.*;

public class harshad {
	public boolean harshadmethod(int num) {
		int temp =num;
		int sum=0;
		while(temp>0) {
			int digit=temp%10;
			sum+=digit;
			temp=temp/10;
		}
		return num%sum==0;
	}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number:");
	int n=sc.nextInt();
	harshad obj=new harshad();
	System.out.println(obj.harshadmethod(n));
	
	sc.close();

}
}
