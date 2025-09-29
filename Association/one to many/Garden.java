class Garden {
    public int dailyVisitors;
    public char type;

    public Garden(int dailyVisitors, char type) {
        this.dailyVisitors = dailyVisitors;
        this.type = type;
    }

    public void displayGarden() {
        System.out.println("Garden Visitors: " + dailyVisitors + ", Type: " + type);
    }
}