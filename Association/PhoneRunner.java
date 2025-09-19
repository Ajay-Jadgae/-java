class PhoneRunner {
    public static void main(String[] args) {
        CommonBattery battery1 = new CommonBattery(5000, true);
        CommonBattery battery2 = new CommonBattery(4200, false);
        CommonBattery battery3 = new CommonBattery(6000, true);

        AndroidPhone samsung = new AndroidPhone("Samsung S23", 70000, battery1);
        IPhone iphone = new IPhone("iPhone 15", 120000, battery2);
        WindowsPhone lumia = new WindowsPhone("Lumia 950", 30000, battery3);

        Chargers charger = new Chargers("Type-C", 65);
        Store store = new Store("Mobile World", "Delhi");
        Warranty warranty = new Warranty(2, true);

        samsung.displayAndroidPhone();
        iphone.displayIPhone();
        lumia.displayWindowsPhone();
        charger.displayCharger();
        store.displayStore();
        warranty.displayWarranty();
    }
}
