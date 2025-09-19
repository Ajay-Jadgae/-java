class Warranty {
    public int years;
    public boolean international;

    public Warranty(int years, boolean international) {
        this.years = years;
        this.international = international;
    }

    public void displayWarranty() {
        System.out.println("Warranty Years = " + years);
        System.out.println("International Warranty = " + international);
    }
}
