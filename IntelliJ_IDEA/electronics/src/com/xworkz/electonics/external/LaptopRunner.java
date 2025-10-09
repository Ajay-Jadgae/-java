package com.xworkz.electonics.external;


import com.xworkz.electonics.internal.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", 75999);
        laptop.displayBrand();
        laptop.displayPrice();
    }
}

