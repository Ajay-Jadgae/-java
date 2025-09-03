class BookRunner {
    public static void main(String[] args) {
        
        Book book1 = new Book();
		
        Book book2 = new Book("Java Basics");
		
        Book book3 = new Book("Java Basics", 120);
		
        Book book4 = new Book("Java Basics", 120, 499.99);
		
        Book book5 = new Book("Java Basics", 120, 499.99,65487994l);
		
        Book book6 = new Book("Java Basics",120, 499.99, 65487994l, true);
		
        Book book7 = new Book("Java Basics", 120, 499.99,65487994l, true, 4.7f);
		
        Book book8 = new Book("Java Basics",120, 499.99, 65487994l, true, 4.7f, 'A');
    }
}
