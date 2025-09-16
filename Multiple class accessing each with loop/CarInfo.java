class CarInfo {
    public String carName;
    public int carPrice;

    public CarInfo(String carName, int carPrice) {
        this.carName = carName;
        this.carPrice = carPrice;
    }

    public void displayCarInfo() {
        System.out.println(carName);
        System.out.println(carPrice);
    }
}



