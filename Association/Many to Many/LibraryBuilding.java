class LibraryBuilding {
    public String buildingName;
    public Cement cement;
    public Sand sand;
    public Bricks bricks;
    public Paint paint;

    public LibraryBuilding(String buildingName, Cement cement, Sand sand, Bricks bricks, Paint paint) {
        this.buildingName = buildingName;
        this.cement = cement;
        this.sand = sand;
        this.bricks = bricks;
        this.paint = paint;
    }

    public void displayLibraryBuildingInfo() {
        System.out.println("This is Materials Required for building Library.");
        System.out.println("Building Name = " + buildingName);
        System.out.println("Cement Bags = " + cement.numberOfBags);
        System.out.println("Sand Tons = " + sand.numberOfTons);
        System.out.println("Bricks = " + bricks.numberOfBricks);
        System.out.println("Paint Liters = " + paint.liters);
    }
}
