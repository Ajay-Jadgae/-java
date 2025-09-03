class MobileRunner {
    public static void main(String[] args) {
        Mobile.brand = "Samsung";
        Mobile.ram = 4;
        Mobile.imei = 987654321098765L;
        Mobile.screenSize = 6.1f;
        Mobile.price = 45000.55;
        Mobile.is5G = false;
        Mobile.qualityRating = 'B';

        Mobile.info();
    }
}