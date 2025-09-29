class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();
        car.info();
        car.info("Toyota");
        car.info("Toyota", 2025);
        car.info("Toyota", 2025, "Red");
    }
}
