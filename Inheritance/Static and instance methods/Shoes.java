class Shoes {
    
    public int size;
    public static String color;
    
    public void showSize() {
        System.out.println("The shoe size is = " + size);
        size = 9;
        System.out.println("The shoe size after reassigning is = " + size);
    }
    
    public static void showColor() {
        System.out.println("The shoe color is = " + color);
        color = "White";
        System.out.println("The shoe color after reassigning is = " + color);
    }
}



