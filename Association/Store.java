class Store {
    public String name;
    public String location;

    public Store(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void displayStore() {
        System.out.println("Store Name = " + name);
        System.out.println("Location = " + location);
    }
}
