package com.Bcl;

public class Employee {
int Employee_Id;
String Employee_name;
String  current_designation;
double salary;
int performanceRating;
 public  Employee(int Employee_Id,String Employee_name,String current_designation,double salary,int performanceRating ) {
	 this.Employee_Id=Employee_Id;
	 this.Employee_name=Employee_name;
	 this.current_designation=current_designation;
	 this.salary=salary;
	 this. performanceRating=performanceRating;
 }
 

 public void setSalary(double salary) {
	this.salary = salary;
 }
 public void setPerformanceRating(int performanceRating) {
	this.performanceRating = performanceRating;
 }


 public int getEmployee_Id() {
	return Employee_Id;
 }


 public String getEmployee_name() {
	return Employee_name;
 }


 public String getCurrent_designation() {
	return current_designation;
 }


 public double getSalary() {
	return salary;
 }


 public int getPerformanceRating() {
	return performanceRating;
 }

public  void promoteEmployee(String desg) {
	if (performanceRating >= 4) {
		  
		   salary = salary + (salary * 20 / 100);
		   System.out.println("Update employee salary"+salary);
          current_designation = desg;
    }
	else {
		System.out.println("not promoted");
	}
}



 

}
