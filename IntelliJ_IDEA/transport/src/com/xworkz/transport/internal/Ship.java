package com.xworkz.transport.internal;



    public class Ship extends Transport {

        public String transportType;
        public double speed;

        public Ship(String transportType, double speed) {
            this.transportType = transportType;
            this.speed = speed;
        }

        @Override
        public void displayTransportType() {
            System.out.println("The transport type is = " + transportType);
        }

        @Override
        public void displayTransportSpeed() {
            System.out.println("The average speed of the ship is = " + speed + " km/h");
        }
    }


