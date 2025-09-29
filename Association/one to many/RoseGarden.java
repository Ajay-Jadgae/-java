class RoseGarden {
    public int noOfRoses;
    public boolean hasFountain;
    public Garden garden;

    public RoseGarden(int noOfRoses, boolean hasFountain, Garden garden) {
        this.noOfRoses = noOfRoses;
        this.hasFountain = hasFountain;
        this.garden = garden;
    }

    public void displayRoseGarden() {
        System.out.println("RoseGarden Roses: " + noOfRoses + ", Fountain: " + hasFountain);
        garden.displayGarden();
    }
}