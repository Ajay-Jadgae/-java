class House {

    public House() {
        System.out.println("Default House Constructor");
    }

    public House(String location) {
        System.out.println("Location = " + location);
    }

    public House(String location, int rooms) {
        System.out.println("Rooms = " + rooms);
    }

    public House(String location, int rooms, double area) {
        System.out.println("Area = " + area );
    }
    public House(String location, int rooms, double area, boolean isFurnished) {
        System.out.println("Furnished = " + isFurnished);
    }

    public House(String location, int rooms, double area, boolean isFurnished, float rating) {
        System.out.println("Rating = " + rating);
    }

    public House(String location, int rooms, double area, boolean isFurnished, float rating, char grade) {
        System.out.println("Grade = " + grade);
    }
}
