class MountainBike {
    public int price;
    public String brand;
    public CommonEngine engine;

    public MountainBike(int price, String brand, CommonEngine engine) {
        this.price = price;
        this.brand = brand;
        this.engine = engine;
    }

    public void displayMountainBike() {
        System.out.println("This is MountainBike class");
        System.out.println("Price of MountainBike = " + price);
        System.out.println("Brand = " + brand);
        System.out.println("Engine CC = " + engine.cc);
        System.out.println("Is engine Electric = " + engine.isElectric);
    }
}
