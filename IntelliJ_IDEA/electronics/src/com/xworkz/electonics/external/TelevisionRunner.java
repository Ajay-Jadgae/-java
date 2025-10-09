package com.xworkz.electonics.external;


import com.xworkz.electonics.internal.Television;

public class TelevisionRunner {
    public static void main(String[] args) {
        Television tv = new Television("Sony", 49999);
        tv.displayBrand();
        tv.displayPrice();
    }
}

