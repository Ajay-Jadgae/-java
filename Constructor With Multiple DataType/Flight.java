class Flight {

    public Flight() {
        System.out.println("Default Flight Constructor");
    }

    public Flight(String airline) {
        System.out.println("Airline = " + airline);
    }

    public Flight(String airline, int flightNumber) {
        System.out.println("Flight Number = " + flightNumber);
    }

    public Flight(String airline, int flightNumber, long num) {
        System.out.println("num = " + num);
    }

    public Flight(String airline, int flightNumber, long num, double price) {
        System.out.println("Price = " + price);
    }

    public Flight(String airline, int flightNumber,long num, double price, boolean isInternational) {
        System.out.println("International = " + isInternational);
    }

    public Flight(String airline, int flightNumber, long num, double price, boolean isInternational, char grade) {
        System.out.println("Grade = " + grade);
    }
}
