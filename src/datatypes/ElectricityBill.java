package datatypes;

class ElectricityBill {

    
    static void calculateBill() {

        
        int units = 250;
        int costPerUnit = 8;

       
        int totalBill = units * costPerUnit;

        
        System.out.println("Electricity Bill");
        System.out.println("Units Used     : " + units);
        System.out.println("Cost Per Unit  : " + costPerUnit);
        System.out.println("Total Bill     : " + totalBill);
    }

    public static void main(String[] args) {

       
        ElectricityBill obj=new ElectricityBill ();
        obj.calculateBill();
    }
}
