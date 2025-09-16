class BookInfo {
    public String bookTitle;
    public int price;

    public BookInfo(String bookTitle,int price) {
        this.bookTitle = bookTitle;
        this.price = price;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + bookTitle);
        System.out.println("Price: " + price);
    }
}


