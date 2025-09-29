class BotanicalGarden {
    public boolean hasRarePlants;
    public float area;
    public Garden garden;

    public BotanicalGarden(boolean hasRarePlants, float area, Garden garden) {
        this.hasRarePlants = hasRarePlants;
        this.area = area;
        this.garden = garden;
    }

    public void displayBotanicalGarden() {
        System.out.println("BotanicalGarden Rare Plants: " + hasRarePlants + ", Area: " + area);
        garden.displayGarden();
    }
}