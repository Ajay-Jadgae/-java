class ShopRunner {
    public static void main(String[] args) {
        Pen p1 = new Pen("Blue", 25);
        Shop shop = new Shop(p1);
        shop.displayPen();
    }
}