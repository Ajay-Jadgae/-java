class Tesla extends VehicleCompanies {

    public Tesla() {
        super();
        System.out.println("No argument constructor in child class (Tesla).");
    }

    
    public void companyName(String name) {
        System.out.println("Child class (Overriding): Vehicle company name = " + name);
    }

    public void vehiclePrice(int amount) {
        System.out.println("Child class (Overriding): Vehicle price = " + amount);
    }

    public void companyName(String name, char rating) {
        System.out.println("Child class (Overloading): Vehicle company = " + name + ", Rating = " + rating);
    }

    public void vehiclePrice(int amount, boolean isElectric) {
        System.out.println("Child class (Overloading): Vehicle price = " + amount + ", Is electric? = " + isElectric);
    }

    public void vehiclePrice(int amount, String type, boolean isElectric) {
        System.out.println("Child class (Overloading): Vehicle price = " + amount + ", Type = " + type + ", Is electric? = " + isElectric);
    }
}