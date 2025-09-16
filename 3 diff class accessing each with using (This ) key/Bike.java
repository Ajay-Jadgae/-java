class Bike {
    public String brand;
    public String model;
    public int price;

    public Bike(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayBike() {
        System.out.println("Brand: " + brand + "  Model: " + model + " Price: " + price);
    }
}


