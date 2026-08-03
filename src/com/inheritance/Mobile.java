package com.inheritance;

public class Mobile {
	String brand;
	String model;
	double price;
	Mobile(){
		this("sumsung");
		System.out.println("create no argument constructor");
	}
	Mobile(String brand){
		this(brand,"S24",80000);
		System.out.println("create a one argument constructor");
		 System.out.println("Brand : " + brand);
	}
	Mobile(String brand,String model,double price){
		this.brand=brand;
		this.model=model;
		this.price=price;
		System.out.println("Three-Argument Constructor");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
	}

	public static void main(String[] args) {
   Mobile obj=new Mobile();
	}

}
