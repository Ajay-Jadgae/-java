class BookRunner {
    public static void main(String[] args) {
        Book.title = "C++ Basics";
        Book.pages = 300;
        Book.isbn = 1234567890123L;
        Book.rating = 3.9f;
        Book.price = 450.75;
        Book.isAvailable = false;
        Book.category = 'B';

        Book.info();
    }
}