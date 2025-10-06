class TempleBuilding {
    public String buildingName;
    public Cement cement;
    public Sand sand;
    public Bricks bricks;
    public Wood wood;

    public TempleBuilding(String buildingName, Cement cement, Sand sand, Bricks bricks, Wood wood) {
        this.buildingName = buildingName;
        this.cement = cement;
        this.sand = sand;
        this.bricks = bricks;
        this.wood = wood;
    }

    public void displayTempleBuildingInfo() {
        System.out.println("This is Materials Required for building Temple.");
        System.out.println("Building Name = " + buildingName);
        System.out.println("Cement Bags = " + cement.numberOfBags);
        System.out.println("Sand Tons = " + sand.numberOfTons);
        System.out.println("Bricks = " + bricks.numberOfBricks);
        System.out.println("Wood CubicFeet = " + wood.cubicFeet);
    }
}
