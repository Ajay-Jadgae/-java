class Book {

    public static String bookTitle = "Java Programming";
    public static int numberOfPages = 500;
    public static double bookPrice = 450.75;
    public static char bookLevel = 'B';
    public static boolean isPublished = true;

    public void printBookTitle() {
        System.out.println("Book Title = " + bookTitle);
    }

    public void printNumberOfPages() {
        System.out.println("Number of Pages = " + numberOfPages);
    }

    public void printBookPrice() {
        System.out.println("Book Price = " + bookPrice);
    }

    public void printBookLevel() {
        System.out.println("Book Level = " + bookLevel);
    }

    public void printIsPublished() {
        System.out.println("Book Published = " + isPublished);
    }
}
