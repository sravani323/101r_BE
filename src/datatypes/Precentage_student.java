package datatypes;

public class Precentage_student {

	void calculatePercentage() {

       
        int sub1 = 90;
        int sub2 = 95;
        int sub3 = 85;
        int sub4 = 90;
        int sub5 = 90;

      
        int total = sub1 + sub2 + sub3 + sub4 + sub5;

        
        double percentage = (total / 500.0) * 100;

        
        System.out.println("Student Percentage Report");
        System.out.println("Total Marks      : " + total);
        System.out.println("Percentage       : " + percentage + "%");
    }
	public static void main(String[] args) {
		Precentage_student obj=new Precentage_student();
        obj.calculatePercentage();

	}

}
