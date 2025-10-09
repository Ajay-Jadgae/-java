package com.xworkz.electonics.internal;


public class Laptop extends Electonics {

    public String brand;
    public double price;

    public Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public void displayBrand() {
        System.out.println("The laptop brand is = " + brand);
    }

    @Override
    public void displayPrice() {
        System.out.println("The laptop price is = " + price);
    }
}

