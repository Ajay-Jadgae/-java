class CarRunner {
    public static void main(String[] args) {
        Car.brand = "BMW";
        Car.modelYear = 2023;
        Car.engineNumber = 999888777L;
        Car.mileage = 15.8f;
        Car.price = 5500000.45;
        Car.isElectric = false;
        Car.fuelType = 'P';

        Car.info();
    }
}
