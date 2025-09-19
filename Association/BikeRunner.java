class BikeRunner {
    public static void main(String[] args) {
        CommonEngine petrolEngine = new CommonEngine(150, false);
        CommonEngine electricEngine = new CommonEngine(250, true);
        CommonEngine hybridEngine = new CommonEngine(200, false);

        SportsBike sports = new SportsBike(120000, "Yamaha", petrolEngine);
        MountainBike mountain = new MountainBike(90000, "Hero", hybridEngine);
        CruiserBike cruiser = new CruiserBike(150000, "Royal Enfield", electricEngine);

        Showroom showroom = new Showroom("BikeWorld", "Bangalore");

        sports.displaySportsBike();
        mountain.displayMountainBike();
        cruiser.displayCruiserBike();
        showroom.displayShowroom();
    }
}
