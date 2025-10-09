package com.xworkz.transport.internal;

public abstract class Transport {

    public Transport(){

        System.out.println("this is the constructor in abstract class");

    }

    public  abstract  void displayTransportType();


    public  abstract  void displayTransportSpeed();
}
