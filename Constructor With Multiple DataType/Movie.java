class Movie {

    public Movie() {
        System.out.println("Default Movie Constructor");
    }

    public Movie(String title) {
        System.out.println("Title = " + title);
    }

    public Movie(String title, int year) {
        System.out.println("Year = " + year);
    }

    public Movie(String title, int year, double budget) {
        System.out.println("Budget = " + budget);
    }

    public Movie(String title,int year, double budget, boolean isHit) {
        System.out.println("Hit = " + isHit);
    }

    public Movie(String title,int year, double budget, boolean isHit, float rating) {
        System.out.println("Rating = " + rating);
    }

    public Movie(String title,int year, double budget, boolean isHit, float rating, char grade) {
        System.out.println("Grade = " + grade);
    }
}
