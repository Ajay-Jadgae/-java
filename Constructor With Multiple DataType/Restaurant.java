class Restaurant {

    public Restaurant() {
        System.out.println("Default Restaurant Constructor");
    }

    public Restaurant(String name) {
        System.out.println("Restaurant Name = " + name);
    }

    public Restaurant(String name, String location) {
        System.out.println("Location = " + location);
    }

    public Restaurant(String name, String location, int tables) {
        System.out.println("Tables = " + tables);
    }

    public Restaurant(String name, String location, int tables, double rating) {
        System.out.println("Rating = " + rating);
    }

    public Restaurant(String name, String location, int tables, double rating, boolean isVeg) {
        System.out.println("Vegetarian = " + isVeg);
    }

    public Restaurant(String name, String location, int tables, double rating, boolean isVeg, float avgPrice) {
        System.out.println("Avg Price = " + avgPrice);
    }

    public Restaurant(String name, String location, int tables, double rating, boolean isVeg, float avgPrice, char grade) {
        System.out.println("Grade = " + grade);
    }
}
