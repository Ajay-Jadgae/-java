class ElementRunner {

    public static void main(String[] args) {

        int ticket = Element.ticketPrice();
        System.out.println("Ticket Price = " + ticket);

        int popcorn = Element.popcornPrice();
        System.out.println("Popcorn Price = " + popcorn);

        int drink = Element.coldDrinkPrice();
        System.out.println("Cold Drink Price = " + drink);

        int glasses = Element.glassesFee(); 
        System.out.println("3D Glasses Fee = " + glasses);

        int parking = Element.parkingFee();
        System.out.println("Parking Fee = " + parking);
    }

}
