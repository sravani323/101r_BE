package com.inheritance;

class Vehicle {

    String brand;
    int price;

    // Parent Constructor
    Vehicle(String brand, int price) {
        this.brand = brand;
        this.price = price;

        System.out.println("Vehicle Constructor Called");
    }
}

class Car extends Vehicle {

    String model;

    // Child Constructor
    Car(String brand, int price, String model) {

        // Calling Parent Constructor
        super(brand, price);

        this.model = model;

        System.out.println("Car Constructor Called");
    }

    void display() {
        System.out.println();
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Model : " + model);
    }
}

public class CarApp {

	public static void main(String[] args) {
		Car obj = new Car("Hyundai", 1500000, "Creta");

        obj.display();

	}

}
