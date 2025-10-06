class BuildingssRunner {
    public static void main(String[] args) {
       
        Cement cement = new Cement(50000);
        Sand sand = new Sand(800);
        Bricks bricks = new Bricks(100000);
        Steel steel = new Steel(120);
        Wood wood = new Wood(300);
        Glass glass = new Glass(500);

       
        StadiumBuilding stadium = new StadiumBuilding("National Stadium", cement, sand, bricks, steel);
        TempleBuilding temple = new TempleBuilding("Golden Temple", cement, sand, bricks, wood);
        ShoppingComplexBuilding shopping = new ShoppingComplexBuilding("City Mall", cement, sand, bricks, glass);

       
        stadium.displayStadiumBuildingInfo();
        temple.displayTempleBuildingInfo();
        shopping.displayShoppingComplexBuildingInfo();
    }
}
