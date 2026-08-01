package com.encap;

public class Student {
private int stu_Id;
 private String Stu_name;
private String course;
private double percentage;
public int getStu_Id() {
	return stu_Id;
}
public void setStu_Id(int stu_Id) {
	this.stu_Id = stu_Id;
}
public String getStu_name() {
	return Stu_name;
}
public void setStu_name(String stu_name) {
	Stu_name = stu_name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
}
