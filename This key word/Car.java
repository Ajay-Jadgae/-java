class Car {
    
    public static String model;
    public static int year;
    public static long engineNumber;
    public static double mileage;
    public static float fuelCapacity;
    public static char safetyRating;
    public static boolean isElectric;

    public Car(String model, int year, long engineNumber, double mileage, float fuelCapacity, char safetyRating, boolean isElectric) {
        this.model = model;
        this.year = year;
        this.engineNumber = engineNumber;
        this.mileage = mileage;
        this.fuelCapacity = fuelCapacity;
        this.safetyRating = safetyRating;
        this.isElectric = isElectric;

        System.out.println("Model = " + this.model);
        System.out.println("Year = " + this.year);
        System.out.println("Engine No = " + this.engineNumber);
        System.out.println("Mileage = " + this.mileage);
        System.out.println("Fuel Capacity = " + this.fuelCapacity);
        System.out.println("Safety Rating = " + this.safetyRating);
        System.out.println("Is Electric = " + this.isElectric);
    }
}
