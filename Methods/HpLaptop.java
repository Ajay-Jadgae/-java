class HpLaptop {

    public void display(String name) {
        System.out.println("Laptop Name: " + name);
    }

    public void display(String name, int modelNumber) {
        System.out.println("Laptop Name: " + name);
        System.out.println("Model Number: " + modelNumber);
    }

    public void display(String name, int modelNumber, long serialNumber) {
        System.out.println("Laptop Name: " + name);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Serial Number: " + serialNumber);
    }

    public void display(String name, int modelNumber, long serialNumber, float weightKg) {
        System.out.println("Laptop Name: " + name);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Weight (kg): " + weightKg);
    }

    public void display(String name, int modelNumber, long serialNumber, float weightKg, double priceUsd) {
        System.out.println("Laptop Name: " + name);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("Price (USD): $" + priceUsd);
    }

    public void display(String name, int modelNumber, long serialNumber, float weightKg, double priceUsd, char category) {
        System.out.println("Laptop Name: " + name);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("Price (USD): $" + priceUsd);
        System.out.println("Category: " + category);
    }

    public void display(String name, int modelNumber, long serialNumber, float weightKg, double priceUsd, char category, boolean isAvailable) {
        System.out.println("Laptop Name: " + name);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("Price (USD): $" + priceUsd);
        System.out.println("Category: " + category);
        System.out.println("Available: " + isAvailable);
    }

    public void display(String name, int modelNumber, long serialNumber, float weightKg, double priceUsd, char category, boolean isAvailable, byte warrantyMonths, short ramGB) {
        System.out.println("Laptop Name: " + name);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("Price (USD): $" + priceUsd);
        System.out.println("Category: " + category);
        System.out.println("Available: " + isAvailable);
        System.out.println("Warranty (months): " + warrantyMonths);
        System.out.println("RAM (GB): " + ramGB);
    }
}
