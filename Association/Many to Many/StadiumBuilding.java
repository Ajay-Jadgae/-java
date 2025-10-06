class StadiumBuilding {
    public String buildingName;
    public Cement cement;
    public Sand sand;
    public Bricks bricks;
    public Steel steel;

    public StadiumBuilding(String buildingName, Cement cement, Sand sand, Bricks bricks, Steel steel) {
        this.buildingName = buildingName;
        this.cement = cement;
        this.sand = sand;
        this.bricks = bricks;
        this.steel = steel;
    }

    public void displayStadiumBuildingInfo() {
        System.out.println("This is Materials Required for building Stadium.");
        System.out.println("Building Name = " + buildingName);
        System.out.println("Cement Bags = " + cement.numberOfBags);
        System.out.println("Sand Tons = " + sand.numberOfTons);
        System.out.println("Bricks = " + bricks.numberOfBricks);
        System.out.println("Steel Tons = " + steel.tons);
    }
}
