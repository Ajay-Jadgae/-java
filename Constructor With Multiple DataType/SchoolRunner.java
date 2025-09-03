class SchoolRunner {
    public static void main(String[] args) {
        
        School school1 = new School();
		
        School school2 = new School("Oxford School");
		
        School school3 = new School("Oxford School", "Bangalore");
		
        School school4 = new School("Oxford School", "Bangalore", 1500);
		
        School school5 = new School("Oxford School", "Bangalore", 1500, 80);
		
        School school6 = new School("Oxford School", "Bangalore", 1500, 80, true);
		
        School school7 = new School("Oxford School", "Bangalore", 1500, 80, true, 4.5f);
		
        School school8 = new School("Oxford School", "Bangalore", 1500, 80, true, 4.5f, 'A');
    }
}
