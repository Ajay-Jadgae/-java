class Bottle {
    
    public int capacity;
    public static String color;
    
    public void showCapacity() {
        System.out.println("The capacity is = " + capacity );
        capacity = 1000;
        System.out.println("The capacity after reassigning is = " + capacity );
    }
    
    public static void showColor() {
        System.out.println("The color is = " + color);
        color = "Transparent";
        System.out.println("The color after reassigning is = " + color);
    }
}




