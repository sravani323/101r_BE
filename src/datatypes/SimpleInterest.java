package datatypes;

public class SimpleInterest {
	  
	 void calculateSI() {

	        
	        int principal = 10000;
	        int rate = 5;
	        int time = 2;

	      
	        int interest = (principal * rate * time) / 100;

	        
	        System.out.println("Simple Interest Details");
	        System.out.println("Principal : " + principal);
	        System.out.println("Rate      : " + rate);
	        System.out.println("Time      : " + time);
	        System.out.println("Interest  : " + interest);
	    }

	    public static void main(String[] args) {

	       
	        SimpleInterest s = new SimpleInterest();

	        
	        s.calculateSI();
}
}
