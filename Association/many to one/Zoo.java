class Zoo {
    public String zooName;
    public Animal animal;
    public Cage cage;
    public Zookeeper zookeeper;

    public Zoo(String zooName, Animal animal, Cage cage, Zookeeper zookeeper) {
        this.zooName = zooName;
        this.animal = animal;
        this.cage = cage;
        this.zookeeper = zookeeper;
    }

    public void displayZooInfo() {
        System.out.println("Zoo Name: " + zooName);
        System.out.println("Animal: " + animal.name + " (" + animal.species + ")");
        System.out.println("Cage Number: " + cage.number);
        System.out.println("Zookeeper: " + zookeeper.name);
    }
}