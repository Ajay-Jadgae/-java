class Gadget {

    public void displayGadget(String name) {
        System.out.println("Gadget Name: " + name);
    }

    public void displayGadget(String name, int modelNumber) {
        System.out.println("Gadget Name: " + name);
        System.out.println("Model Number: " + modelNumber);
    }

    public void displayGadget(String name, int modelNumber, long serialNumber) {
        System.out.println("Gadget Name: " + name);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Serial Number: " + serialNumber);
    }

    public void displayGadget(String name, int modelNumber, long serialNumber, float weightKg) {
        System.out.println("Gadget Name: " + name);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Weight (kg): " + weightKg);
    }

    public void displayGadget(String name, int modelNumber, long serialNumber, float weightKg, double priceUsd) {
        System.out.println("Gadget Name: " + name);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("Price (USD): $" + priceUsd);
    }

    public void displayGadget(String name, int modelNumber, long serialNumber, float weightKg, double priceUsd, char category) {
        System.out.println("Gadget Name: " + name);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("Price (USD): $" + priceUsd);
        System.out.println("Category: " + category);
    }

    public void displayGadget(String name, int modelNumber, long serialNumber, float weightKg, double priceUsd, char category, boolean isAvailable) {
        System.out.println("Gadget Name: " + name);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("Price (USD): $" + priceUsd);
        System.out.println("Category: " + category);
        System.out.println("Available: " + isAvailable);
    }
}
