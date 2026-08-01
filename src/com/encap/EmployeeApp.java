package com.encap;


public class EmployeeApp {
    public static void main(String[] args) {

        // Create Employee object
        Employee emp = new Employee();

        // Set values using setter methods
        emp.setEmployeeId(1001);
        emp.setEmployeeName("Ravi");
        emp.setDepartment("Development");
        emp.setSalary(45000.0);

        // Display values using getter methods
        System.out.println("Employee Details");
        System.out.println("----------------");
        System.out.println("Employee ID   : " + emp.getEmployeeId());
        System.out.println("Employee Name : " + emp.getEmployeeName());
        System.out.println("Department    : " + emp.getDepartment());
        System.out.println("Salary        : " + emp.getSalary());
    }
}