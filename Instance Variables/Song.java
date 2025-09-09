class Song {
    public String title = "Shape of You";
    public int duration = 4; 
    public long streams = 5000000000L;
    public double rating = 9.2;
    public float popularity = 98.5f;
    public char genre = 'P';
    public boolean isTrending = true;

    public void displayInfo() {
        System.out.println("Title = " + title);
        System.out.println("Duration = " + duration );
        System.out.println("Streams = " + streams);
        System.out.println("Rating = " + rating);
        System.out.println("Popularity = " + popularity);
        System.out.println("Genre = " + genre);
        System.out.println("Trending = " + isTrending);
    }
}
