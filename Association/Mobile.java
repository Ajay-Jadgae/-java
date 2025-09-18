class Mobile {
    String brand;
    int price;
    SIM sim;  

 public Mobile(String brand, int price, SIM sim) {
        this.brand = brand;
        this.price = price;
        this.sim = sim;
    }

 public void displayMobile() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("sim: " + sim.provider);
        System.out.println("sim: " + sim.number);
        sim.displaySIM();
    }
}
