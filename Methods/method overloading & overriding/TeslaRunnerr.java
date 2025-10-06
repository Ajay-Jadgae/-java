class TeslaRunner {
    public static void main(String[] args) {

        Tesla tesla = new Tesla();

        tesla.companyName("Tesla");
        tesla.vehiclePrice(120000);

        tesla.companyName("Tesla", "USA");
        tesla.vehiclePrice(120000, "Car");

        tesla.companyName("Tesla", 'A');
        tesla.vehiclePrice(120000, true);
        tesla.vehiclePrice(150000, "Truck", false);
    }
}