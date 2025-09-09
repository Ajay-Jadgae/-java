class Hotel {

    public String name = "Taj Palace";
    public int rooms = 250;
    public long gstNumber = 12345678901L;
    public double pricePerNight = 7500.99;
    public float rating = 4.8f;
    public char category = 'L';
    public boolean hasSwimmingPool = true;

    public void displayInfo() {
        System.out.println("Hotel Name = " + name);
        System.out.println("Rooms = " + rooms);
        System.out.println("GST Number = " + gstNumber);
        System.out.println("Price per Night = " + pricePerNight);
        System.out.println("Rating = " + rating);
        System.out.println("Category = " + category);
        System.out.println("Has Swimming Pool = " + hasSwimmingPool);
    }
}

