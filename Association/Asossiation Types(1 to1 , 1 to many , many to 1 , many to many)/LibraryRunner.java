class LibraryRunner {
    public static void main(String[] args) {
        Book book = new Book(300);
        Magazine magazine = new Magazine(100);
        Newspaper newspaper = new Newspaper(20);

        Library library = new Library("City Library", 3, book, magazine, newspaper);
        library.displayLibraryInfo();
    }
}
