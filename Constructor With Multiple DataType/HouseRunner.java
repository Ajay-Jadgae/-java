class HouseRunner {
    public static void main(String[] args) {
        
        House house1  = new House();
		
        House house2 = new House("Bangalore");
		
        House house3 = new House("Bangalore", 3);
		
        House house4 = new House("Bangalore", 3, 1200.5);
		
        House house5 = new House("Bangalore", 3, 1200.5,true);
		
        House house6 = new House("Bangalore", 3, 1200.5,true, 4.8f);
		
        House house7 = new House("Bangalore", 3, 1200.5,true, 4.8f, 'A');
    }
}
