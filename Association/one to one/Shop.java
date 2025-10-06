class Shop {
    
    public Pen pen;

    public Shop(Pen pen) {
        this.pen = pen;
    }

    public void displayPen() {
        System.out.println("Pen Color = " + pen.color);
        System.out.println("Pen Price = " + pen.price);
    }
}