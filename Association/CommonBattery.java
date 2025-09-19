class CommonBattery {
    public int capacity;
    public boolean isFastCharging;

    public CommonBattery(int capacity, boolean isFastCharging) {
        this.capacity = capacity;
        this.isFastCharging = isFastCharging;
    }

    public void displayCommonBattery() {
        System.out.println("This is CommonBattery class");
        System.out.println("Capacity = " + capacity + " mAh");
        System.out.println("Fast Charging = " + isFastCharging);
    }
}
