package com.encap;
import java.util.*;

public class StudentApp {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the student ID:");
      int stud_id=sc.nextInt();
      
      System.out.println("Enter the Student NAME:");
      String stud_name=sc.next();
      
      System.out.println("Enter the student Course:");
      String course=sc.next();
      
      System.out.println("Enter the percentage");
      double precentage=sc.nextDouble();
      
      Student obj=new Student();
      obj.setStu_Id(stud_id);
     obj.setStu_name(stud_name);
     obj.setCourse(course);
     obj.setPercentage(precentage);
     System.out.println(" student ID:"+obj.getCourse());
     System.out.println(" Student NAME:"+obj.getStu_name());
     System.out.println(" student Course:"+obj.getCourse());
     System.out.println("percentage:"+obj.getPercentage());
     
     
      
      
	}

}
