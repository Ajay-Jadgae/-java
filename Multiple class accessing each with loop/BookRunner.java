class BookRunner {
    public static void main(String[] args) {
        Book book = new Book();

        BookInfo book1 = new BookInfo("Rich Dad Poor Dad",399);
        BookInfo book2 = new BookInfo("Atomic Habits",499);
        BookInfo book3 = new BookInfo("The Alchemist", 299);

        BookInfo[] bookList = { book1, book2, book3 };

        book.displayBooks(bookList);
    }
}
