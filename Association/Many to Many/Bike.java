class Bike {
    public String bikeName;
    public Engine engine;
    public Wheels wheels;
    public Seats seats;

    public Bike(String bikeName, Engine engine, Wheels wheels, Seats seats) {
        this.bikeName = bikeName;
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
    }

    public void displayBikeInfo() {
        System.out.println("This is Bike Information:");
        System.out.println("Bike Name = " + bikeName);
        System.out.println("Engine Horsepower = " + engine.power);
        System.out.println("Number of Wheels = " + wheels.numberOfWheels);
        System.out.println("Number of Seats = " + seats.numberOfSeats);
    }
}