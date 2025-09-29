class RAM {
    public int sizeGB;

    public RAM(int sizeGB) {
        this.sizeGB = sizeGB;
    }

    public void displayRAM() {
        System.out.println("RAM= " + sizeGB);
    }
}