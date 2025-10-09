package com.xworkz.transport.external;

import com.xworkz.transport.internal.Airplane;

public class AirplaneRunner {

    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airplane", 850.0);
        airplane.displayTransportType();
        airplane.displayTransportSpeed();
    }
}

