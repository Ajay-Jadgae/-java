class Showroom {
    public String name;
    public String city;

    public Showroom(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void displayShowroom() {
        System.out.println("Showroom name = " + name);
        System.out.println("City = " + city);
    }
}
