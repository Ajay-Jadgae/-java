class Laptop {

    public static String brand = "Dell";
    public static int ram = 16;
    public static double price = 75000.50;
    public static char grade = 'A';
    public static boolean isAvailable = true;

    public void brand() {
        System.out.println("Brand = " + brand);
    }

    public void ram() {
        System.out.println("RAM = " + ram + " GB");
    }

    public void price() {
        System.out.println("Price = " + price);
    }

    public void grade() {
        System.out.println("Grade = " + grade);
    }

    public void isAvailable() {
        System.out.println("Available = " + isAvailable);
    }
}
