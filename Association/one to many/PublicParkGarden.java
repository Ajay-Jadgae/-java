class PublicParkGarden {
    public int swings;
    public boolean hasPlayGround;
    public Garden garden;

    public PublicParkGarden(int swings, boolean hasPlayGround, Garden garden) {
        this.swings = swings;
        this.hasPlayGround = hasPlayGround;
        this.garden = garden;
    }

    public void displayPublicParkGarden() {
        System.out.println("PublicParkGarden Swings: " + swings + ", Playground: " + hasPlayGround);
        System.out.println("Garden daily Visitors: " + garden.dailyVisitors + ", Garden type: " + garden.type);
    }
}
