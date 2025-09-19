class Chargers {
    public String type;
    public int power;

    public Chargers(String type, int power) {
        this.type = type;
        this.power = power;
    }

    public void displayCharger() {
        System.out.println("Charger Type = " + type);
        System.out.println("Power = " + power + "W");
    }
}
