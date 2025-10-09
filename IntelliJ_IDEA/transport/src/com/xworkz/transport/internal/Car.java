package com.xworkz.transport.internal;

public class Car extends Transport{

  public  String transportType;

  public double speed;


  public Car(String transportType,double speed){

      this.transportType=  transportType;
      this.speed=speed;
  }

    @Override
    public void displayTransportType() {
        System.out.println("the transport type is="+transportType);
    }

    @Override
    public void displayTransportSpeed() {
        System.out.println("the transport speed is="+speed);
    }
}
