class WindowsPhone {
    public String brand;
    public int price;
    public CommonBattery battery;

    public WindowsPhone(String brand, int price, CommonBattery battery) {
        this.brand = brand;
        this.price = price;
        this.battery = battery;
    }

    public void displayWindowsPhone() {
        System.out.println("This is WindowsPhone class");
        System.out.println("Brand = " + brand);
        System.out.println("Price = " + price);
        System.out.println("Battery Capacity = " + battery.capacity + " mAh");
        System.out.println("Is Fast Charging = " + battery.isFastCharging);
    }
}
