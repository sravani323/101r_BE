package datatypes;

public class Student {
	static String collegeName="ABC College";
	String studentName;
	int studentId;
	public static void collegeInfo() {
		System.out.println("student college Info"+collegeName);
	}
	public void studentInfo()
	{
		System.out.println("student name:"+studentName);
		System.out.println("student name:"+studentId);
		
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.studentName="Ravi";
		obj.studentId=101;
		collegeInfo();
		obj.studentInfo();
	}

}
