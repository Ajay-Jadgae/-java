class Mobile {
    
    public int price;
    public static String brand;
    
    public void showPrice() {
        System.out.println("The price is = " + price);
        price = 30000;
        System.out.println("The price after reassigning is = " + price);
    }
    
    public static void showBrand() {
        System.out.println("The brand is = " + brand);
        brand = "Apple";
        System.out.println("The brand after reassigning is = " + brand);
    }
}