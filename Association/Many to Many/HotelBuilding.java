class HotelBuilding {
    public String buildingName;
    public Cement cement;
    public Sand sand;
    public Bricks bricks;
    public Tiles tiles;

    public HotelBuilding(String buildingName, Cement cement, Sand sand, Bricks bricks, Tiles tiles) {
        this.buildingName = buildingName;
        this.cement = cement;
        this.sand = sand;
        this.bricks = bricks;
        this.tiles = tiles;
    }

    public void displayHotelBuildingInfo() {
        System.out.println("This is Materials Required for building Hotel.");
        System.out.println("Building Name = " + buildingName);
        System.out.println("Cement Bags = " + cement.numberOfBags);
        System.out.println("Sand Tons = " + sand.numberOfTons);
        System.out.println("Bricks = " + bricks.numberOfBricks);
        System.out.println("Tiles Required = " + tiles.numberOfTiles);
    }
}
