class Bus {

    public String operator = "KSRTC";
    public int busNumber = 1025;
    public long registrationNumber = 9876543210L;
    public double ticketPrice = 250.50;
    public float duration = 5.5f; 
    public char type = 'V'; 
    public boolean isAvailable = true;

    public void displayInfo() {
        System.out.println("Operator = " + operator);
        System.out.println("Bus Number = " + busNumber);
        System.out.println("Registration Number = " + registrationNumber);
        System.out.println("Ticket Price = " + ticketPrice);
        System.out.println("Duration = " + duration );
        System.out.println("Type = " + type);
        System.out.println("Available = " + isAvailable);
    }
}
