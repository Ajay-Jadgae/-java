class City {

    public static String name;
    public static int population;
    public static long area;
    public static float literacyRate;
    public static double gdp;
    public static boolean isCapital;
    public static char rank;

    public static void info() {
        System.out.println("Value before reassigning = " + name);
        name = "Bengaluru";
        System.out.println("Value After reassigning = " + name);

        System.out.println("Value before reassigning = " + population);
        population = 13000000;
        System.out.println("Value After reassigning = " + population);

        System.out.println("Value before reassigning = " + area);
        area = 709000L;
        System.out.println("Value After reassigning = " + area);

        System.out.println("Value before reassigning = " + literacyRate);
        literacyRate = 88.7f;
        System.out.println("Value After reassigning = " + literacyRate);

        System.out.println("Value before reassigning = " + gdp);
        gdp = 120000.55;
        System.out.println("Value After reassigning = " + gdp);

        System.out.println("Value before reassigning = " + isCapital);
        isCapital = true;
        System.out.println("Value After reassigning = " + isCapital);

        System.out.println("Value before reassigning = " + rank);
        rank = 'A';
        System.out.println("Value After reassigning = " + rank);
    }
}

