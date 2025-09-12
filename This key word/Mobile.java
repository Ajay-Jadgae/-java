class Mobile {

    public Mobile() {
        this("Samsung");
        System.out.println("This is no-argument constructor");
    }

    public Mobile(String brand) {
        this("Samsung", 15000);
        System.out.println("This is 1-argument constructor");
        System.out.println("Brand = " + brand);
    }

    public Mobile(String brand, int price) {
        this("Samsung", 15000, 64L);
        System.out.println("This is 2-argument constructor");
        System.out.println("Price = " + price);
    }

    public Mobile(String brand, int price, long storage) {
        this("Samsung", 15000, 64L, 6.5);
        System.out.println("This is 3-argument constructor");
        System.out.println("Storage = " + storage );
    }

    public Mobile(String brand, int price, long storage, double screenSize) {
        this("Samsung", 15000, 64L, 6.5, 180.5f);
        System.out.println("This is 4-argument constructor");
        System.out.println("Screen Size = " + screenSize);
    }

    public Mobile(String brand, int price, long storage, double screenSize, float weight) {
        this("Samsung", 15000, 64L, 6.5, 180.5f, true);
        System.out.println("This is 5-argument constructor");
        System.out.println("Weight = " + weight);
    }

    public Mobile(String brand, int price, long storage, double screenSize, float weight, boolean is5G) {
        this("Samsung", 15000, 64L, 6.5, 180.5f, true, 'A');
        System.out.println("This is 6-argument constructor");
        System.out.println("Is 5G = " + is5G);
    }

    public Mobile(String brand, int price, long storage, double screenSize, float weight, boolean is5G, char grade) {
        System.out.println("This is 7-argument constructor");
        System.out.println("Grade = " + grade);
    }
}
