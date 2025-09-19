class SportsBike {
    public int price;
    public String brand;
    public CommonEngine engine;

    public SportsBike(int price, String brand, CommonEngine engine) {
        this.price = price;
        this.brand = brand;
        this.engine = engine;
    }

    public void displaySportsBike() {
        System.out.println("This is SportsBike class");
        System.out.println("Price of SportsBike = " + price);
        System.out.println("Brand = " + brand);
        System.out.println("Engine CC = " + engine.cc);
        System.out.println("Is engine Electric = " + engine.isElectric);
    }
}
