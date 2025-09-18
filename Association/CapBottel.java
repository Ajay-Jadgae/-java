class CapBottel {
    String color;
    int size;
    Bottle bottle;  

 public CapBottel(String color, int size, Bottle bottle) {
        this.color = color;
        this.size = size;
        this.bottle = bottle;
    }

 public void displayCap() {
        System.out.println("Cap Color: " + color);
        System.out.println("Cap Size: " + size);
        System.out.println("bottle " + bottle.price);
        System.out.println("bottle " + bottle.brand);
        bottle.displayBottle();  
    }
}