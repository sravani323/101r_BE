package datatypes;

class Circle {

   
    static void calculateCircleArea() {

        int radius = 7;
        double area = 3.14 * radius * radius;

        System.out.println("Circle Details");
        System.out.println("Radius : " + radius);
        System.out.println("Area   : " + area);
    }

    public static void main(String[] args) {

        
        Circle c = new Circle();

        
        c.calculateCircleArea();
    }
}
