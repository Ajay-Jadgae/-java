package com.xworkz.transport.internal;

public class Airplane extends Transport {

    public String transportType;
    public double speed;

    public Airplane(String transportType, double speed) {
        this.transportType = transportType;
        this.speed = speed;
    }

    @Override
    public void displayTransportType() {
        System.out.println("The transport type is = " + transportType);
    }

    @Override
    public void displayTransportSpeed() {
        System.out.println("The average speed of the airplane is = " + speed + " km/h");
    }
}
