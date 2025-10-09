package com.xworkz.transport.external;

import com.xworkz.transport.internal.Car;

public class CarRunner {

    public static void main(String[] args) {
        Car car = new Car("Car", 120.5);
        car.displayTransportType();
        car.displayTransportSpeed();
    }
}

