class BottleCapRunner {
    public static void main(String[] args) {
        Bottle bottles = new Bottle(120, "Milton");
        CapBottel caps = new CapBottel("Black", 5, bottles);

        caps.displayCap();
    }
}
