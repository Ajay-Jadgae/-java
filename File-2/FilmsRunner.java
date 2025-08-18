class FilmsRunner {

    public static void main(String[] args) {

        int ticket = Films.ticketPrice();
        System.out.println(" Ticket Price = " + ticket);

        int popcorn = Films.popcornPrice();
        System.out.println(" Popcorn Price = " + popcorn);

        int drink = Films.coldDrinkPrice();
        System.out.println(" Cold Drink Price = " + drink);

        int glasses = Films.threeDGlassesFee();
        System.out.println(" 3D Glasses Fee = " + glasses);

        int parking = Films.parkingFee();
        System.out.println(" Parking Fee = " + parking);

        int total = ticket + popcorn + drink + glasses + parking;
        System.out.println(" Total Cost = " + total);
    }
}
