package loop;
import java.util.*;
public class Duck {
 public boolean isDuck(int n) {
	 String num=String.valueOf(n);
	 for(int i=0;i<num.length();i++) {
		 if(num.charAt(i)=='0') {
			 return true;
		 }
		
	 }
	 return false;
 }
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:");
    int n=sc.nextInt();
    Duck obj=new Duck();
    if(obj.isDuck(n)) {
    	System.out.println("Duck number");
    }else {
    	System.out.println("! Duck number");
    }
    sc.close();;
    
	}

}
