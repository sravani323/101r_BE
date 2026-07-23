package com.Bcl;

public class EmployeeProcessor {

	public static void main(String[] args) {
		Employee obj = new Employee(201, "Bob", "Developer", 50000, 5);

        System.out.println("Before Promotion:");
        System.out.println("Employee ID: " + obj.getEmployee_Id());
        System.out.println("Name: " + obj.getEmployee_name());
        System.out.println("Designation: " + obj.getCurrent_designation());
        System.out.println("Salary: $" + obj.getSalary());
        System.out.println("Performance Rating: " + obj.getPerformanceRating());

        obj.promoteEmployee();

     
        System.out.println("New Designation: " + obj.getCurrent_designation());
        System.out.println("Updated Salary: $" + obj.getSalary());
		
	}

}
