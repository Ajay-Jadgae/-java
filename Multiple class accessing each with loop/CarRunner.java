class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();

        CarInfo car1 = new CarInfo("Tata Nexon", 95000);
        CarInfo car2 = new CarInfo("Hyundai Creta", 12000);
        CarInfo car3 = new CarInfo("Mahindra Thar", 18000);

        CarInfo[] carList = { car1, car2, car3 };

        car.displayCars(carList);
    }
}
