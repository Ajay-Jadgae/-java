class Train {

    public String name = "Shatabdi Express";
    public int trainNumber = 12010;
    public long ticketNumber = 456789123456L;
    public double fare = 1450.75;
    public float speed = 120.5f; 
    public char coachType = 'A'; 
    public boolean isRunning = true;

    public void displayInfo() {
        System.out.println("Train Name = " + name);
        System.out.println("Train Number = " + trainNumber);
        System.out.println("Ticket Number = " + ticketNumber);
        System.out.println("Fare = " + fare);
        System.out.println("Speed = " + speed );
        System.out.println("Coach Type = " + coachType);
        System.out.println("Running = " + isRunning);
    }
}

