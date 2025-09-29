class Car {
    public Car() {
        this("DefaultCar");
        System.out.println("No-arg constructor called");
    }

    public Car(String brand) {
        this(brand, 2025);
        System.out.println("Constructor with brand called: " + brand);
    }

    public Car(String brand, int year) {
        this(brand, year, "White");
        System.out.println("Constructor with brand & year called: " + brand + ", " + year);
    }

    public Car(String brand, int year, String color) {
        System.out.println("Constructor with brand, year & color called: " + brand + ", " + year + ", " + color);
    }
}


