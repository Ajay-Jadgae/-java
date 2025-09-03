class UniversityRunner {
    public static void main(String[] args) {
        
        University university1 = new University();
		
        University university2 = new University("Oxford");
		
        University university3 = new University("Oxford", "London");
		
        University university4 = new University("Oxford", "London", 30);
		
        University university5 = new University("Oxford", "London", 30, 20000);
		
        University university6 = new University("Oxford", "London", 30, 20000, 1.0);
		
        University university7 = new University("Oxford", "London", 30, 20000, 1.0, true);
		
        University university8 = new University("Oxford", "London", 30, 20000, 1.0, true, 'A');
    }
}
