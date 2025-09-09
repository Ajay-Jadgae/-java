class Restaurant {

    public String name = "Food Plaza";
    public int tables = 25;
    public long licenseNumber = 9876543211L;
    public double rating = 4.7;
    public float avgMealPrice = 350.5f;
    public char category = 'A'; 
    public boolean isOpen = true;

    public void displayInfo() {
        System.out.println("Restaurant Name = " + name);
        System.out.println("Tables = " + tables);
        System.out.println("License Number = " + licenseNumber);
        System.out.println("Rating = " + rating);
        System.out.println("Average Meal Price = " + avgMealPrice);
        System.out.println("Category = " + category);
        System.out.println("Open = " + isOpen);
    }
}


