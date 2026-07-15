package datatypes;

public class School {
     static String SchoolName="RGUKT,Basar";
     String StudentName;
     int rollNo;
     void display() {
         int marks = 95;   // Local variable

         System.out.println("School Name : " + SchoolName);
         System.out.println("Student Name : " + StudentName);
         System.out.println("Roll Number : " + rollNo);
         System.out.println("Marks : " + marks);
     }
     
     
	public static void main(String[] args) {
		 School student = new School();
		 student.StudentName = "Sravani";
	        student.rollNo = 101;
	        student.display();

	}

}
