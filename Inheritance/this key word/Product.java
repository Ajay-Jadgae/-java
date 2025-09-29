class Product {
    public String productName;
    public int price;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }
}

class UltimateStore {

    public UltimateStore() {
        this(50);
        System.out.println("No-arg constructor called");
    }

    public UltimateStore(int employees) {
        this(employees, "DefaultStore");
        System.out.println("Constructor with employees = " + employees);
    }

    public UltimateStore(int employees, String storeName) {
        this(storeName, 100, true);
        System.out.println("Constructor with employees & storeName = " + employees + ", " + storeName);
    }

    public UltimateStore(String storeName, int products, boolean isOpen) {
        this(storeName, products, isOpen, 4.5f);
        System.out.println("Constructor with storeName, products, isOpen = " + storeName + ", " + products + ", " + isOpen);
    }

    public UltimateStore(String storeName, int products, boolean isOpen, float rating) {
        this(storeName, products, isOpen, rating, 'A');
        System.out.println("Constructor with rating = " + rating);
    }

    public UltimateStore(String storeName, int products, boolean isOpen, float rating, char grade) {
        this(new String[]{"TV","Laptop","Mobile"}, 50000.0);
        System.out.println("Constructor with grade = " + grade);
    }

    public UltimateStore(String[] productNames, double revenue) {
        this(productNames, revenue, new Product("Camera", 3000));
        System.out.println("Constructor with productNames array and revenue = " + revenue);
    }

    public UltimateStore(String[] productNames, double revenue, Product featuredProduct) {
        this(true, 4.9f, 'B', 5555L);
        System.out.println("Constructor with featuredProduct = " + featuredProduct.productName);
    }

    public UltimateStore(boolean isOpen, float rating, char grade, long storeID) {
        this("MegaBrand", 200, false, 9.5, 'C', true);
        System.out.println("Constructor with isOpen, rating, grade, storeID = " + isOpen + ", " + rating + ", " + grade + ", " + storeID);
    }

    public UltimateStore(String brand, int products, boolean isPopular, double revenue, char grade, boolean isOnline) {
        this(new int[]{1,2,3,4,5});
        System.out.println("Constructor with brand, products, revenue, grade, isOnline = " + brand + ", " + products + ", " + revenue + ", " + grade + ", " + isOnline);
    }

    public UltimateStore(int[] stock) {
        this(stock.length, "SuperStore", 10.5f, true, 'D');
        System.out.println("Constructor with int array = length " + stock.length);
    }

    public UltimateStore(int products, String storeName, float rating, boolean isOpen, char grade) {
        this(500.0, 250L, "FeaturedProduct");
        System.out.println("Constructor with products, storeName, rating, isOpen, grade");
    }

    public UltimateStore(double revenue, long storeID, String featuredProduct) {
        this('X', true, 5, 99.9f);
        System.out.println("Constructor with revenue, storeID, featuredProduct = " + revenue + ", " + storeID + ", " + featuredProduct);
    }

    public UltimateStore(char grade, boolean isPopular, int employees, float rating) {
        this("LastStore", 1000, true, 5.5, 'Z', 9999L);
        System.out.println("Constructor with grade, isPopular, employees, rating");
    }

    public UltimateStore(String storeName, int products, boolean isOpen, float rating, char grade, long storeID) {
        System.out.println("Full constructor executed:");
        System.out.println("Store Name = " + storeName + ", Products = " + products + ", IsOpen = " + isOpen + ", Rating = " + rating + ", Grade = " + grade + ", StoreID = " + storeID);
    }
}
