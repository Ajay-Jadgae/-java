class Book {
    
    public static String title;
    public static int edition;
    public static long isbn;
    public static double price;
    public static float thickness;
    public static char rating;
    public static boolean isHardcover;

    public Book(String title, int edition, long isbn, double price, float thickness, char rating, boolean isHardcover) {
        this.title = title;
        this.edition = edition;
        this.isbn = isbn;
        this.price = price;
        this.thickness = thickness;
        this.rating = rating;
        this.isHardcover = isHardcover;

        System.out.println("Title = " + this.title);
        System.out.println("Edition = " + this.edition);
        System.out.println("ISBN = " + this.isbn);
        System.out.println("Price = " + this.price);
        System.out.println("Thickness = " + this.thickness);
        System.out.println("Rating = " + this.rating);
        System.out.println("Is Hardcover = " + this.isHardcover);
    }
}
