package com.xworkz.electonics.external;


import com.xworkz.electonics.internal.Mobile;

public class MobileRunner {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Samsung", 29999);
        mobile.displayBrand();
        mobile.displayPrice();
    }
}

