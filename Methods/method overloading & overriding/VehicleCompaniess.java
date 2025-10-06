class VehicleCompanies {

    public VehicleCompanies() {
        System.out.println("No argument constructor in parent class (VehicleCompanies).");
    }

    public void companyName(String name) {
        System.out.println("Parent class: Vehicle company name = " + name);
    }

    public void vehiclePrice(int amount) {
        System.out.println("Parent class: Vehicle price = " + amount);
    }

    public void companyName(String name, String country) {
        System.out.println("Parent class: Vehicle company = " + name + ", Country = " + country);
    }

    public void vehiclePrice(int amount, String type) {
        System.out.println("Parent class: Vehicle price = " + amount + ", Type = " + type);
    }
}




