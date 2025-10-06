class AirportBuilding {
    public String buildingName;
    public Cement cement;
    public Sand sand;
    public Bricks bricks;
    public Doors doors;

    public AirportBuilding(String buildingName, Cement cement, Sand sand, Bricks bricks, Doors doors) {
        this.buildingName = buildingName;
        this.cement = cement;
        this.sand = sand;
        this.bricks = bricks;
        this.doors = doors;
    }

    public void displayAirportBuildingInfo() {
        System.out.println("This is Materials Required for building Airport.");
        System.out.println("Building Name = " + buildingName);
        System.out.println("Cement Bags = " + cement.numberOfBags);
        System.out.println("Sand Tons = " + sand.numberOfTons);
        System.out.println("Bricks = " + bricks.numberOfBricks);
        System.out.println("Doors Required = " + doors.numberOfDoors);
    }
}
