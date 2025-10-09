package com.xworkz.transport.external;


import com.xworkz.transport.internal.Ship;

public class ShipRunner {

    public static void main(String[] args) {
        Ship ship = new Ship("Ship", 45.6);
        ship.displayTransportType();
        ship.displayTransportSpeed();
    }
}
