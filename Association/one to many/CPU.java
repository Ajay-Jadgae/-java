class CPU {
    public String brand;
    public double speedGHz;

    public CPU(String brand, double speedGHz) {
        this.brand = brand;
        this.speedGHz = speedGHz;
    }

    public void displayCPU() {
        System.out.println("CPU= " + brand );
        System.out.println("speedGHz= " + speedGHz );
    }
}




