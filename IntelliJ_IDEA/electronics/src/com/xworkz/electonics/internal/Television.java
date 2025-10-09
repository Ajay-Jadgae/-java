package com.xworkz.electonics.internal;


public class Television extends Electonics {

    public String brand;
    public double price;

    public Television(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public void displayBrand() {
        System.out.println("The television brand is = " + brand);
    }

    @Override
    public void displayPrice() {
        System.out.println("The television price is = " + price);
    }
}

