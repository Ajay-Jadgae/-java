class Mobile {

    public Mobile() {
        System.out.println("Default Mobile Constructor");
    }

    public Mobile(String brand) {
        System.out.println("Brand = " + brand);
    }

    public Mobile(String brand, int ram) {
        System.out.println("RAM = " + ram);
    }

    public Mobile(String brand, int ram, long storage) {
        System.out.println("Storage = " + storage);
    }

    public Mobile(String brand, int ram, long storage, double price) {
        System.out.println("Price = " + price);
    }

    public Mobile(String brand, int ram, long storage, double price, boolean is5G) {
        System.out.println("5G Support = " + is5G);
    }

    public Mobile(String brand, int ram, long storage, double price, boolean is5G, float rating) {
        System.out.println("Rating = " + rating);
    }

    public Mobile(String brand, int ram, long storage, double price, boolean is5G, float rating, char grade) {
        System.out.println("Grade = " + grade);
    }
}
