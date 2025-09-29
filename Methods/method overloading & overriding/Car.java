class Car extends Vehicle {

    public void info() {
        super.info();
        System.out.println("No-arg method in Car");
    }

    public void info(String model) {
        super.info(model);
        System.out.println("One-arg method in Car, model = " + model);
    }

    public void info(String model, int year) {
        super.info(model, year);
        System.out.println("Two-arg method in Car, model = " + model + ", year = " + year);
    }

    public void info(String model, int year, String color) {
        super.info(model, year, color);
        System.out.println("Three-arg method in Car, model = " + model + ", year = " + year + ", color = " + color);
    }
}
