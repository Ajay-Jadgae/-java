class Chair {
    
    public int legs;
    public static String material;
    
    public void showLegs() {
        System.out.println("The number of legs = " + legs);
        legs = 5;
        System.out.println("The number of legs after reassigning = " + legs);
    }
    
    public static void showMaterial() {
        System.out.println("The material is = " + material);
        material = "Steel";
        System.out.println("The material after reassigning is = " + material);
    }
}

