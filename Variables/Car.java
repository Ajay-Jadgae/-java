class Car {

    public static String brand;
    public static int modelYear;
    public static long engineNumber;
    public static float mileage;
    public static double price;
    public static boolean isElectric;
    public static char fuelType;

    public static void info() {
        System.out.println("Value before reassigning = " + brand);
        brand = "Tesla";
        System.out.println("Value After reassigning = " + brand);

        System.out.println("Value before reassigning = " + modelYear);
        modelYear = 2025;
        System.out.println("Value After reassigning = " + modelYear);

        System.out.println("Value before reassigning = " + engineNumber);
        engineNumber = 1234567890L;
        System.out.println("Value After reassigning = " + engineNumber);

        System.out.println("Value before reassigning = " + mileage);
        mileage = 450.75f;
        System.out.println("Value After reassigning = " + mileage);

        System.out.println("Value before reassigning = " + price);
        price = 7500000.99;
        System.out.println("Value After reassigning = " + price);

        System.out.println("Value before reassigning = " + isElectric);
        isElectric = true;
        System.out.println("Value After reassigning = " + isElectric);

        System.out.println("Value before reassigning = " + fuelType);
        fuelType = 'E';
        System.out.println("Value After reassigning = " + fuelType);
    }
}

