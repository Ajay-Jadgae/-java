class Bus {
    public String busName;
    public Engine engine;
    public Wheels wheels;
    public Seats seats;

    public Bus(String busName, Engine engine, Wheels wheels, Seats seats) {
        this.busName = busName;
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
    }

    public void displayBusInfo() {
        System.out.println("This is Bus Information:");
        System.out.println("Bus Name = " + busName);
        System.out.println("Engine Horsepower = " + engine.power);
        System.out.println("Number of Wheels = " + wheels.numberOfWheels);
        System.out.println("Number of Seats = " + seats.numberOfSeats);
    }
}