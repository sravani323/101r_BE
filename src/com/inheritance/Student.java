package com.inheritance;

public class Student {
	int stud_id;
	String name;
	String course;
	
	Student(int stud_id,String name,String course){
		this.stud_id=stud_id;
		this.name=name;
		this.course=course;
		}
	Student(Student obj){
		this.stud_id=obj.stud_id;
		this.name=obj.name;
		this.course=obj.course;
	}
	void display() {
		System.out.println("Student ID:"+stud_id);
		System.out.println("Student Name:"+name);
		System.out.println("Student course"+course);
	}
	

	public static void main(String[] args) {
     Student obj=new Student(101,"Rahul","Java Full Stack");
     Student obj2=new Student(obj);
     System.out.println("Student 1 Details");
     System.out.println("-----------------");
     obj.display();
     
     System.out.println();

     System.out.println("Student 2 Details");
     System.out.println("-----------------");
     obj2.display();
	}

}
