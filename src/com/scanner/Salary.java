package com.scanner;
import java.util.*;

public class Salary {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Employee ID:");
    int Emp_id=sc.nextInt();
    
    System.out.println("Employee Name:");
    String name =sc.next();
   
    System.out.println("Employee Salary:");
    double salary=sc.nextDouble();
    
    double hra =salary * 0.20;
    double da = salary * 0.10;
    double grossSalary = salary + hra + da;
    
    System.out.println("\nEmployee Details");
    System.out.println("----------------");
    System.out.println("Employee ID   : " + Emp_id);
    System.out.println("Employee Name : " + name);
    System.out.println("Basic Salary  : " + salary);
    System.out.println("Gross Salary  : " + grossSalary);

    
    
    
	}

}
