class ElectronicsStore {

    public ElectronicsStore() {
        this(10);
        System.out.println("No-arg constructor called");
    }

    public ElectronicsStore(int employees) {
        this(employees, "DefaultStore");
        System.out.println("Constructor with employees = " + employees);
    }

    public ElectronicsStore(int employees, String storeName) {
        this(storeName, true, 5.5f);
        System.out.println("Constructor with employees and storeName = " + employees + ", " + storeName);
    }

    public ElectronicsStore(String storeName, boolean isOpen, float rating) {
        this(isOpen, rating, 'A', 100000L);
        System.out.println("Constructor with storeName, isOpen, rating = " + storeName + ", " + isOpen + ", " + rating);
    }

    public ElectronicsStore(boolean isOpen, float rating, char grade, long storeID) {
        this(50000.0, "HighTech", 20, 'B', true);
        System.out.println("Constructor with isOpen, rating, grade, storeID = " + isOpen + ", " + rating + ", " + grade + ", " + storeID);
    }

    public ElectronicsStore(double revenue, String brand, int products, char grade, boolean isPopular) {
        this("MegaStore", 250, false, 4.5f, 'C');
        System.out.println("Constructor with revenue, brand, products, grade, isPopular = " + revenue + ", " + brand + ", " + products + ", " + grade + ", " + isPopular);
    }

    public ElectronicsStore(String storeName, int employees, boolean isOpen, float rating, char grade) {
        this(100, "PremiumElectronics", 5.6, true, 5000L, 'D');
        System.out.println("Constructor with storeName, employees, isOpen, rating, grade = " + storeName + ", " + employees + ", " + isOpen + ", " + rating + ", " + grade);
    }

    public ElectronicsStore(int products, String brand, double rating, bool
