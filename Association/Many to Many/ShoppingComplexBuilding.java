class ShoppingComplexBuilding {
    public String buildingName;
    public Cement cement;
    public Sand sand;
    public Bricks bricks;
    public Glass glass;

    public ShoppingComplexBuilding(String buildingName, Cement cement, Sand sand, Bricks bricks, Glass glass) {
        this.buildingName = buildingName;
        this.cement = cement;
        this.sand = sand;
        this.bricks = bricks;
        this.glass = glass;
    }

    public void displayShoppingComplexBuildingInfo() {
        System.out.println("This is Materials Required for building Shopping Complex.");
        System.out.println("Building Name = " + buildingName);
        System.out.println("Cement Bags = " + cement.numberOfBags);
        System.out.println("Sand Tons = " + sand.numberOfTons);
        System.out.println("Bricks = " + bricks.numberOfBricks);
        System.out.println("Glass Sheets = " + glass.numberOfSheets);
    }
}
