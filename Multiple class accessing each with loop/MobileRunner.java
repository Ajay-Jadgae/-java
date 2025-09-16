class MobileRunner {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();

        MobileInfo mobile1 = new MobileInfo("iPhone 16", 1250);
        MobileInfo mobile2 = new MobileInfo("Samsung Galaxy S24", 9500);
        MobileInfo mobile3 = new MobileInfo("OnePlus 12R", 4500);
        MobileInfo mobile4 = new MobileInfo("Realme Narzo 70", 1899);

        MobileInfo[] mobileList = { mobile1, mobile2, mobile3, mobile4 };

        mobile.displayAllMobiles(mobileList);
    }
}
