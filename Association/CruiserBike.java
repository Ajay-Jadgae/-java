class CruiserBike {
    public int price;
    public String brand;
    public CommonEngine engine;

    public CruiserBike(int price, String brand, CommonEngine engine) {
        this.price = price;
        this.brand = brand;
        this.engine = engine;
    }

    public void displayCruiserBike() {
        System.out.println("This is CruiserBike class");
        System.out.println("Price of CruiserBike = " + price);
        System.out.println("Brand = " + brand);
        System.out.println("Engine CC = " + engine.cc);
        System.out.println("Is engine Electric = " + engine.isElectric);
    }
}
