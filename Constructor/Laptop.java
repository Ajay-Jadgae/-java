class Laptop {
    
    public Laptop() {
        this("Dell");
        System.out.println("No argumental constructor.");
    }

    public Laptop(String brand) {
        this("Dell", 101);
        System.out.println("One argumental constructor.");
        System.out.println("Brand = " + brand);
    }

    public Laptop(String brand, int modelNumber) {
        this("Dell", 101, 55000.75);
        System.out.println("Two argumental constructor.");
        System.out.println("Brand = " + brand);
        System.out.println("Model Number = " + modelNumber);
    }

    public Laptop(String brand, int modelNumber, double price) {
        this("Dell", 101, 55000.75, 512);
        System.out.println("Three argumental constructor.");
        System.out.println("Brand = " + brand);
        System.out.println("Model Number = " + modelNumber);
        System.out.println("Price = " + price);
    }

    public Laptop(String brand, int modelNumber, double price, int storage) {
        this("Dell", 101, 55000.75, 512, "Intel i7");
        System.out.println("Four argumental constructor.");
        System.out.println("Brand = " + brand);
        System.out.println("Model Number = " + modelNumber);
        System.out.println("Price = " + price);
        System.out.println("Storage = " + storage + "GB");
    }

    public Laptop(String brand, int modelNumber, double price, int storage, String processor) {
        this("Dell", 101, 55000.75, 512, "Intel i7", 16);
        System.out.println("Five argumental constructor.");
        System.out.println("Brand = " + brand);
        System.out.println("Model Number = " + modelNumber);
        System.out.println("Price = " + price);
        System.out.println("Storage = " + storage + "GB");
        System.out.println("Processor = " + processor);
    }

    public Laptop(String brand, int modelNumber, double price, int storage, String processor, int ram) {
        this("Dell", 101, 55000.75, 512, "Intel i7", 16, true);
        System.out.println("Six argumental constructor.");
        System.out.println("Brand = " + brand);
        System.out.println("Model Number = " + modelNumber);
        System.out.println("Price = " + price);
        System.out.println("Storage = " + storage + "GB");
        System.out.println("Processor = " + processor);
        System.out.println("RAM = " + ram + "GB");
    }

    public Laptop(String brand, int modelNumber, double price, int storage, String processor, int ram, boolean isGaming) {
        System.out.println("Seven argumental constructor.");
        System.out.println("Brand = " + brand);
        System.out.println("Model Number = " + modelNumber);
        System.out.println("Price = " + price);
        System.out.println("Storage = " + storage + "GB");
        System.out.println("Processor = " + processor);
        System.out.println("RAM = " + ram + "GB");
        System.out.println("Is Gaming Laptop = " + isGaming);
    }
}
