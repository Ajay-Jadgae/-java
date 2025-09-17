class Car{

    public int price;
    public Engine engine;   

    public Car(int price) {
        this.price = price;
    }

    public void displayCar(Engine engine) {   
        this.engine = engine;
        System.out.println("The car price is = " + price);
    }
}