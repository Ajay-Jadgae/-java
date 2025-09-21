class Library {
    public String libraryName;
    public int totalBooks;
    public Book book;
    public Magazine magazine;
    public Newspaper newspaper;

    public Library(String libraryName, int totalBooks, Book book, Magazine magazine, Newspaper newspaper) {
        this.libraryName = libraryName;
        this.totalBooks = totalBooks;
        this.book = book;
        this.magazine = magazine;
        this.newspaper = newspaper;
    }

    public void displayLibraryInfo() {
        System.out.println("This is Library class.");
        System.out.println("Library Name = " + libraryName);
        System.out.println("Total Books = " + totalBooks);
        System.out.println("Book Price = " + book.bookPrice);
        System.out.println("Magazine Price = " + magazine.magazinePrice);
        System.out.println("Newspaper Price = " + newspaper.newspaperPrice);
    }
}




