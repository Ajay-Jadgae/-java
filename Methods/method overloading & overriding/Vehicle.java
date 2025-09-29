class Vehicle {
    
    public void info() {
        System.out.println("No-arg method in Vehicle");
    }

    public void info(String model) {
        System.out.println("One-arg method in Vehicle, model = " + model);
    }

    public void info(String model, int year) {
        System.out.println("Two-arg method in Vehicle, model = " + model + ", year = " + year);
    }

    public void info(String model, int year, String color) {
        System.out.println("Three-arg method in Vehicle, model = " + model + ", year = " + year + ", color = " + color);
    }
}


