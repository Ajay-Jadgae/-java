class Book {

    public static String title;
    public static int pages;
    public static long isbn;
    public static float rating;
    public static double price;
    public static boolean isAvailable;
    public static char category;

    public static void info() {
        System.out.println("Value before reassigning = " + title);
        title = "Java Programming";
        System.out.println("Value After reassigning = " + title);

        System.out.println("Value before reassigning = " + pages);
        pages = 450;
        System.out.println("Value After reassigning = " + pages);

        System.out.println("Value before reassigning = " + isbn);
        isbn = 9780135166307L;
        System.out.println("Value After reassigning = " + isbn);

        System.out.println("Value before reassigning = " + rating);
        rating = 4.8f;
        System.out.println("Value After reassigning = " + rating);

        System.out.println("Value before reassigning = " + price);
        price = 599.99;
        System.out.println("Value After reassigning = " + price);

        System.out.println("Value before reassigning = " + isAvailable);
        isAvailable = true;
        System.out.println("Value After reassigning = " + isAvailable);

        System.out.println("Value before reassigning = " + category);
        category = 'A';
        System.out.println("Value After reassigning = " + category);
    }
}


