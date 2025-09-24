class Pen {
    
    public int cost;
    public static String inkColor;
    
    public void showCost() {
        System.out.println("The cost is = " + cost);
        cost = 200;
        System.out.println("The cost after reassigning is = " + cost);
    }
    
    public static void showInkColor() {
        System.out.println("The ink color is = " + inkColor);
        inkColor = "Black";
        System.out.println("The ink color after reassigning is = " + inkColor);
    }
}



