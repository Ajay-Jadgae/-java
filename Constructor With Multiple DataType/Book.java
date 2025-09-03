class Book {

    public Book() {
        System.out.println("Default Book Constructor");
    }

    public Book(String title) {
        System.out.println("Title = " + title);
    }

    public Book(String title, int pages) {
        System.out.println("pages = " + pages);
    }

    public Book(String title,int pages, double price) {
        System.out.println("Price = " + price);
    }

    public Book(String title, int pages, double price, long num) {
        System.out.println("num = " + num);
    }

    public Book(String title, int pages, double price,long num, boolean isPublished) {
        System.out.println("Published = " + isPublished);
    }

    public Book(String title,int pages, double price,long num, boolean isPublished, float rating) {
        System.out.println("Rating = " + rating);
    }

    public Book(String title,int pages, double price,long num, boolean isPublished, float rating, char grade) {
        System.out.println("Grade = " + grade);
    }
}
