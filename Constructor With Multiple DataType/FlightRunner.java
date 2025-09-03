class FlightRunner {
    public static void main(String[] args) {
        
        Flight f1 = new Flight();
		
        Flight f2 = new Flight("IndiGo");
		
        Flight f3 = new Flight("IndiGo", 6201);
		
        Flight f4 = new Flight("IndiGo", 6201,56466665l);
		
        Flight f6 = new Flight("IndiGo", 6201, 56466665l, 4500);
		
        Flight f7 = new Flight("IndiGo", 6201,  56466665l, 4500, false);
		
        Flight f8 = new Flight("IndiGo", 6201,  56466665l, 4500, false, 'A');
    }
}
