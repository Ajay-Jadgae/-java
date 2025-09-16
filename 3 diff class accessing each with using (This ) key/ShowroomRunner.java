class ShowroomRunner {
    public static void main(String[] args) {
        Showroom showroom = new Showroom();

        Bike bike1 = new Bike("Royal Enfield", "Classic 350", 200000);
        Bike bike2 = new Bike("KTM", "Duke 390", 350000);
        Bike bike3 = new Bike("Yamaha", "R15 V4", 180000);
        Bike bike4 = new Bike("Honda", "CB350", 210000);
        Bike bike5 = new Bike("Bajaj", "Pulsar 220F", 160000);

        Bike[] bikeList = { bike1, bike2, bike3, bike4, bike5 };

        showroom.showBikes(bikeList);
    }
}
