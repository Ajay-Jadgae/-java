class MegaStore {

    public MegaStore() {
        this(100);
        System.out.println("No-arg constructor called");
    }

    public MegaStore(int employees) {
        this(employees, "DefaultMegaStore");
        System.out.println("Constructor with employees = " + employees);
    }

    public MegaStore(int employees, String storeName) {
        this(storeName, 50, true);
        System.out.println("Constructor with employees & storeName = " + employees + ", " + storeName);
    }

    public MegaStore(String storeName, int products, boolean isOpen) {
        this(storeName, products, isOpen, 4.5f);
        System.out.println("Constructor with storeName, products, isOpen = " + storeName + ", " + products + ", " + isOpen);
    }

    public MegaStore(String storeName, int products, boolean isOpen, float rating) {
        this(storeName, products, isOpen, rating, 'A');
        System.out.println("Constructor with rating = " + rating);
    }

    public MegaStore(String storeName, int products, boolean isOpen, float rating, char grade) {
        this(50000.0, true, 1000L, storeName);
        System.out.println("Constructor with grade = " + grade);
    }

    public MegaStore(double revenue, boolean isPopular, long storeID, String storeName) {
        this(new String[]{"TV", "Laptop", "Mobile"}, revenue);
        System.out.println("Constructor with revenue, isPopular, storeID, storeName = " + revenue + ", " + isPopular + ", " + storeID + ", " + storeName);
    }

    public MegaStore(String[] products, double revenue) {
        this(products, revenue, 10);
        System.out.println("Constructor with products array and revenue");
    }

    public MegaStore(String[] products, double revenue, int discount) {
        this(true, 4.9f, 'B', 5555L);
        System.out.println("Constructor with discount = " + discount);
    }

    public MegaStore(boolean isOpen, float rating, char grade, long storeID) {
        this("PremiumBrand", 100, true, 9.5, 'C', false);
        System.out.println("Constructor with isOpen, rating, grade, storeID");
    }

    public MegaStore(String brand, int products, boolean isPopular, double revenue, char grade, boolean isOnline) {
        System.out.println("Full constructor executed:");
        System.out.println("Brand = " + brand + ", Products = " + products + ", Popular = " + isPopular + ", Revenue = " + revenue + ", Grade = " + grade + ", Online = " + isOnline);
    }
}
