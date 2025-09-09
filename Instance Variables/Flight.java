class Flight {

    public String airline = "Emirates";
    public int flightNumber = 2025;
    public long ticketNumber = 12345678901L;
    public double ticketPrice = 55000.99;
    public float duration = 7.5f;  
    public char classType = 'B'; 
    public boolean isInternational = true;

    public void displayInfo() {
        System.out.println("Airline = " + airline);
        System.out.println("Flight Number = " + flightNumber);
        System.out.println("Ticket Number = " + ticketNumber);
        System.out.println("Ticket Price = " + ticketPrice);
        System.out.println("Duration = " + duration + " hrs");
        System.out.println("Class Type = " + classType);
        System.out.println("International = " + isInternational);
    }
}

