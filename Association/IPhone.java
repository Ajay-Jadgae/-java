class IPhone {
    public String model;
    public int price;
    public CommonBattery battery;

    public IPhone(String model, int price, CommonBattery battery) {
        this.model = model;
        this.price = price;
        this.battery = battery;
    }

    public void displayIPhone() {
        System.out.println("This is IPhone class");
        System.out.println("Model = " + model);
        System.out.println("Price = " + price);
        System.out.println("Battery Capacity = " + battery.capacity + " mAh");
        System.out.println("Is Fast Charging = " + battery.isFastCharging);
    }
}
