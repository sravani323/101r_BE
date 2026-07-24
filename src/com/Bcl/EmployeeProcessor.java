package com.Bcl;
import java.util.*;
public class EmployeeProcessor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("entr the des");
		String des=sc.next();
		System.out.print("Enter the salary");
		double sal=sc.nextDouble();
		System.out.println("enter the rating");
		int rating=sc.nextInt();
		Employee obj = new Employee(id, name, des, sal, rating);

        System.out.println("Before Promotion:");
        System.out.println("Employee ID: " + obj.getEmployee_Id());
        System.out.println("Name: " + obj.getEmployee_name());
        System.out.println("Designation: " + obj.getCurrent_designation());
        System.out.println("Salary: $" + obj.getSalary());
        System.out.println("Performance Rating: " + obj.getPerformanceRating());
        
        System.out.println("enter the update des:");
        String desgupdate=sc.next();
         System.out.println("Update the employee ");
        obj.promoteEmployee(desgupdate);
        System.out.println("New Designation: " + obj.getCurrent_designation());
        
        sc.close();
		
	}

}
