package datatypes;

public class Example {

	
	
		
	    static String companyName = "ABC Technologies";
	    static String companyLocation = "Hyderabad";

	    
	    String employeeName;
	    int employeeId;

	    
	    void display() {
	        System.out.println("Company Name    : " + companyName);
	        System.out.println("Company Location: " + companyLocation);
	        System.out.println("Employee Name   : " + employeeName);
	        System.out.println("Employee ID     : " + employeeId);
	        System.out.println();
	    }

	    public static void main(String[] args) {

	        
	    	Example emp1 = new Example();
	        emp1.employeeName = "Sravani";
	        emp1.employeeId = 101;

	        // Creating second object
	        Example emp2 = new Example();
	        emp2.employeeName = "Swathi";
	        emp2.employeeId = 102;

	        emp1.display();
	        emp2.display();
	}

}
