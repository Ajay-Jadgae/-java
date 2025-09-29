class Smartphone {

    public void display(String name) {
        System.out.println("Smartphone Name: " + name);
    }

    public void display(String name, int modelNumber) {
        System.out.println("Smartphone Name: " + name);
        System.out.println("Model Number: " + modelNumber);
    }

    public void display(String name, int modelNumber, long serialNumber) {
        System.out.println("Smartphone Name: " + name);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Serial Number: " + serialNumber);
    }

    public void display(String name, int modelNumber, long serialNumber, float weightKg) {
        System.out.println("Smartphone Name: " + name);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Weight (kg): " + weightKg);
    }

    public void display(String name, int modelNumber, long serialNumber, float weightKg, double priceUsd) {
        System.out.println("Smartphone Name: " + name);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("Price (USD): $" + priceUsd);
    }

    public void display(String name, int modelNumber, long serialNumber, float weightKg, double priceUsd, char category) {
        System.out.println("Smartphone Name: " + name);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("Price (USD): $" + priceUsd);
        System.out.println("Category: " + category);
    }

    public void display(String name, int modelNumber, long serialNumber, float weightKg, double priceUsd, char category, boolean isAvailable) {
        System.out.println("Smartphone Name: " + name);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("Price (USD): $" + priceUsd);
        System.out.println("Category: " + category);
        System.out.println("Available: " + isAvailable);
    }

    public void display(String name, int modelNumber, long serialNumber, float weightKg, double priceUsd,
                        char category, boolean isAvailable, byte warrantyMonths, short batteryCapacity) {
        System.out.println("Smartphone Name: " + name);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("Price (USD): $" + priceUsd);
        System.out.println("Category: " + category);
        System.out.println("Available: " + isAvailable);
