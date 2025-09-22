class VehicleRunner {
    public static void main(String[] args) {
        Engine carEngine = new Engine(150);
        Engine busEngine = new Engine(300);
        Engine bikeEngine = new Engine(50);

        Wheels carWheels = new Wheels(4);
        Wheels busWheels = new Wheels(6);
        Wheels bikeWheels = new Wheels(2);

        Seats carSeats = new Seats(5);
        Seats busSeats = new Seats(40);
        Seats bikeSeats = new Seats(2);

        Car car = new Car("Swift", carEngine, carWheels, carSeats);
        Bus bus = new Bus("Volvo", busEngine, busWheels, busSeats);
        Bike bike = new Bike("Royal Enfield", bikeEngine, bikeWheels, bikeSeats);

        car.displayCarInfo();
        bus.displayBusInfo();
        bike.displayBikeInfo();
    }
}