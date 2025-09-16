class Showroom {

    public void showBikes(Bike[] bikes) {
        System.out.println("Total Bikes Available= " + bikes.length);

        for (int num = 0; num < bikes.length; num++) {
            Bike race=bikes[num];
			race.displayBike();
        }
    }
}