class Fan {

    public Fan() {
        this("Usha");
        System.out.println("This is no-argument constructor");
    }

    public Fan(String brand) {
        this("Usha", 3);
        System.out.println("This is 1-argument constructor");
        System.out.println("Brand = " + brand);
    }

    public Fan(String brand, int speedLevels) {
        this("Usha", 3, 4000L);
        System.out.println("This is 2-argument constructor");
        System.out.println("Speed Levels = " + speedLevels);
    }

    public Fan(String brand, int speedLevels, long price) {
        this("Usha", 3, 4000L, 120.0);
        System.out.println("This is 3-argument constructor");
        System.out.println("Price = " + price);
    }

    public Fan(String brand, int speedLevels, long price, double power) {
        this("Usha", 3, 4000L, 120.0, 3.2f);
        System.out.println("This is 4-argument constructor");
        System.out.println("Power = " + power);
    }

    public Fan(String brand, int speedLevels, long price, double power, float weight) {
        this("Usha", 3, 4000L, 120.0, 3.2f, true);
        System.out.println("This is 5-argument constructor");
        System.out.println("Weight = " + weight);
    }

    public Fan(String brand, int speedLevels, long price, double power, float weight, boolean isRemote) {
        this("Usha", 3, 4000L, 120.0, 3.2f, true, 'A');
        System.out.println("This is 6-argument constructor");
        System.out.println("Remote Controlled = " + isRemote);
    }

    public Fan(String brand, int speedLevels, long price, double power, float weight, boolean isRemote, char rating) {
        System.out.println("This is 7-argument constructor");
        System.out.println("Rating = " + rating);
    }
}
