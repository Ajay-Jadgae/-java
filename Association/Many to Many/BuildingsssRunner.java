class BuildingsssRunner {
    public static void main(String[] args) {
        
        Cement cement = new Cement(60000);
        Sand sand = new Sand(900);
        Bricks bricks = new Bricks(120000);
        Paint paint = new Paint(1500);
        Tiles tiles = new Tiles(20000);
        Doors doors = new Doors(300);

        
        LibraryBuilding library = new LibraryBuilding("City Library", cement, sand, bricks, paint);
        HotelBuilding hotel = new HotelBuilding("Grand Hotel", cement, sand, bricks, tiles);
        AirportBuilding airport = new AirportBuilding("International Airport", cement, sand, bricks, doors);

      
        library.displayLibraryBuildingInfo();
        hotel.displayHotelBuildingInfo();
        airport.displayAirportBuildingInfo();
    }
}
