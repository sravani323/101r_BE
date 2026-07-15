package loop;
import java.util.*;
public class Automorphic_Number {
	public boolean isAutomorphic(int n) {
		int sqaure=n*n;
		int num=n;
		int digit=1;
		while(num>=10) {
			digit*=10;
			num/=10;
		}
		return (sqaure%(digit*10)==n);
	}

	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number:");
  int n=sc.nextInt();
  Automorphic_Number obj=new Automorphic_Number();
  System.out.println(obj.isAutomorphic(n)?"Automorphic_Number":"!Automorphic_Number");
  sc.close();
	}

}
