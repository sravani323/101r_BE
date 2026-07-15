package datatypes;

public class Mobile {

	 static String brand = "Samsung";
    String model;
    int price;

    
    static void brandInfo() {
        System.out.println("Brand : " + brand);
    }

    
    void mobileInfo() {
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }

	public static void main(String[] args) {
		
		Mobile m = new Mobile();

        
        m.model = "S24";
        m.price = 80000;

       
        Mobile.brandInfo();
        m.mobileInfo();

	}

}
