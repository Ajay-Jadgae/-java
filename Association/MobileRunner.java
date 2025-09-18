class MobileRunner {
    public static void main(String[] args) {
        SIM sim = new SIM("Jio", "9876543210");
        Mobile mobile = new Mobile("Samsung", 25000, sim);

        mobile.displayMobile();
    }
}
