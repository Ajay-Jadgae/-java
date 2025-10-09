package com.xworkz.electonics.internal;


public class Mobile extends Electonics {

    public String brand;
    public double price;

    public Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public void displayBrand() {
        System.out.println("The mobile brand is = " + brand);
    }

    @Override
    public void displayPrice() {
        System.out.println("The mobile price is = ₹" + price);
    }
}
