class MobileRunner {
    public static void main(String[] args) {
        
        Mobile mobile1= new Mobile();
		
        Mobile mobile2 = new Mobile("Samsung");
		
        Mobile mobile3 = new Mobile("Samsung", 8);
		
        Mobile mobile4 = new Mobile("Samsung", 8, 128);
		
        Mobile mobile5 = new Mobile("Samsung", 8, 128, 35000.50);
		
        Mobile mobile6 = new Mobile("Samsung", 8, 128, 35000.50, true);
		
        Mobile mobile7 = new Mobile("Samsung", 8, 128, 35000.50, true, 4.5f);
		
        Mobile mobile8 = new Mobile("Samsung", 8, 128, 35000.50, true, 4.5f, 'A');
    }
}
