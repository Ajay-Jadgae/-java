class Mobile {

    public Mobile() {
        this("Samsung");
        System.out.println("No argumental constructor.");
    }

    public Mobile(String brand) {
        this("Samsung", "Galaxy S25");
        System.out.println("One argumental constructor.");
        System.out.println("Brand = " + brand);
    }

    public Mobile(String brand, String model) {
        this("Samsung", "Galaxy S25", 8);
        System.out.println("Two argumental constructor.");
        System.out.println("Brand = " + brand);
        System.out.println("Model = " + model);
    }

    public Mobile(String brand, String model, int ram) {
        this("Samsung", "Galaxy S25", 8, 256);
        System.out.println("Three argumental constructor.");
        System.out.println("Brand = " + brand);
        System.out.println("Model = " + model);
        System.out.println("RAM = " + ram + "GB");
    }

    public Mobile(String brand, String model, int ram, int storage) {
        this("Samsung", "Galaxy S25", 8, 256, 69999.99);
        System.out.println("Four argumental constructor.");
        System.out.println("Brand = " + brand);
        System.out.println("Model = " + model);
        System.out.println("RAM = " + ram + "GB");
        System.out.println("Storage = " + storage + "GB");
    }

    public Mobile(String brand, String model, int ram, int storage, double price) {
        this("Samsung", "Galaxy S25", 8, 256, 69999.99, true);
        System.out.println("Five argumental constructor.");
        System.out.println("Brand = " + brand);
        System.out.println("Model = " + model);
        System.out.println("RAM = " + ram + "GB");
        System.out.println("Storage = " + storage + "GB");
        System.out.println("Price = " + price);
    }

    public Mobile(String brand, String model, int ram, int storage, double price, boolean is5G) {
        System.out.println("Six argumental constructor.");
        System.out.println("Brand = " + brand);
        System.out.println("Model = " + model);
