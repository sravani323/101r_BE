package datatypes;

public class Employee {
	static String companyName = "Infosys";

    
    int employeeId;
    String employeeName;

   
    static void companyInfo() {
        System.out.println("Company Name : " + companyName);
    }

   
    void employeeInfo() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
    }


	public static void main(String[] args) {
		 Employee emp = new Employee();

	    
	        emp.employeeId = 1001;
	        emp.employeeName = "Ram";

	       
	        Employee.companyInfo();
	        emp.employeeInfo();

	}

}
