package com.scanner;
import java.util.*;

public class Student_info {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the Student ID:");
    int stud_id=sc.nextInt();
    
    System.out.println("Enter Student Name:");
    String name=sc.next();
    
    System.out.println("Enter Age:");
    int age=sc.nextInt();
    
    System.out.println("Enter Course:");
    String course=sc.next();
    
    System.out.println("Student Details");
    System.out.println("------------------");
    System.out.println("Student ID:"+stud_id);
    System.out.println("Student Name:"+name);
    System.out.println("Age:"+age);
    System.out.println("Course:"+course);
    
	}

}
