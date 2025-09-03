class RestaurantRunner {
    public static void main(String[] args) {
        
        Restaurant shpoe1 = new Restaurant();
		
        Restaurant shpoe2 = new Restaurant("KFC");
		
        Restaurant shpoe3 = new Restaurant("KFC", "Mall Road");
		
        Restaurant shpoe4 = new Restaurant("KFC", "Mall Road", 50);
		
        Restaurant shpoe5 = new Restaurant("KFC", "Mall Road", 50, 4.2);
		
        Restaurant shpoe6 = new Restaurant("KFC", "Mall Road", 50, 4.2, false);
		
        Restaurant shpoe7 = new Restaurant("KFC", "Mall Road", 50, 4.2, false, 350.5f);
		
        Restaurant shpoe8 = new Restaurant("KFC", "Mall Road", 50, 4.2, false, 350.5f, 'A');
    }
}
