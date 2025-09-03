class MovieRunner {
    public static void main(String[] args) {
        
        Movie movie1 = new Movie();
		
        Movie movie2 = new Movie("Inception");
		
        Movie movie3 = new Movie("Inception", 2010);
		
        Movie movie4 = new Movie("Inception",2010, 160000000);
		
        Movie movie5 = new Movie("Inception",2010, 160000000, true);
		
        Movie movie6 = new Movie("Inception", 2010, 160000000, true, 4.8f);
		
        Movie movie7 = new Movie("Inception", 2010, 160000000, true, 4.8f, 'A');
    }
}
