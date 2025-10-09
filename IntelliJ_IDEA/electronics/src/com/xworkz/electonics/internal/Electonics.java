package com.xworkz.electonics.internal;

public abstract class Electonics {

    public Electonics() {
        System.out.println("This is the constructor in abstract Electronics class.");
    }

    public abstract void displayBrand();

    public abstract void displayPrice();
}
