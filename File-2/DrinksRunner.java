class DrinksRunner {

    public static void main(String[] args) {

        int water = Drinks.waterBottlePrice();
        System.out.println("Water Bottle Price = " + water);

        int cola = Drinks.colaPrice();
        System.out.println("Cola Price = " + cola);

        int juice = Drinks.juicePrice();
        System.out.println("Juice Price = " + juice);

        int energy = Drinks.energyDrinkPrice();
        System.out.println("Energy Drink Price = " + energy);

        int milkshake = Drinks.milkshakePrice();
        System.out.println("Milkshake Price = " + milkshake);
    }

}
