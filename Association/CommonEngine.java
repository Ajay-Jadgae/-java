class CommonEngine {
    public int cc;
    public boolean isElectric;

    public CommonEngine(int cc, boolean isElectric) {
        this.cc = cc;
        this.isElectric = isElectric;
    }

    public void displayCommonEngine() {
        System.out.println("This is CommonEngine class");
        System.out.println("Engine CC = " + cc);
        System.out.println("Is engine Electric = " + isElectric);
    }
}
