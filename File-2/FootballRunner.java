class FootballRunner {

    public static void main(String[] args) {

        int ball = Football.footballPrice();
        System.out.println("Football Price = " + ball);

        int shoes = Football.shoesPrice();
        System.out.println("Shoes Price = " + shoes);

        int jersey = Football.jerseySetPrice();
        System.out.println("Jersey Set Price = " + jersey);

        int net = Football.goalNetCost();
        System.out.println("Goal Net Cost = " + net);

        int booking = Football.groundBookingFee();
        System.out.println("Ground Booking Fee = " + booking);
    }

}
