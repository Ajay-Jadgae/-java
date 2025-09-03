class Mobile {

    public static String brand;
    public static int ram;
    public static long imei;
    public static float screenSize;
    public static double price;
    public static boolean is5G;
    public static char qualityRating;

    public static void info() {
        System.out.println("Value before reassigning = " + brand);
        brand = "iPhone";
        System.out.println("Value After reassigning = " + brand);

        System.out.println("Value before reassigning = " + ram);
        ram = 8;
        System.out.println("Value After reassigning = " + ram);

        System.out.println("Value before reassigning = " + imei);
        imei = 123456789012345L;
        System.out.println("Value After reassigning = " + imei);

        System.out.println("Value before reassigning = " + screenSize);
        screenSize = 6.5f;
        System.out.println("Value After reassigning = " + screenSize);

        System.out.println("Value before reassigning = " + price);
        price = 125000.99;
        System.out.println("Value After reassigning = " + price);

        System.out.println("Value before reassigning = " + is5G);
        is5G = true;
        System.out.println("Value After reassigning = " + is5G);

        System.out.println("Value before reassigning = " + qualityRating);
        qualityRating = 'A';
        System.out.println("Value After reassigning = " + qualityRating);
    }
}


