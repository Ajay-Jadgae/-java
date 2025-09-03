class LaptopRunner{
  
  public static void main(String [] args){
        
        Laptop laptopOne = new Laptop();
		
        Laptop laptopTwo = new Laptop("Apple");
		
        Laptop laptopFour= new Laptop("Apple", 128);
		
        Laptop laptopFive = new Laptop("Apple",128,656545664l);
		
        Laptop laptopSix = new Laptop("Apple", 128,656545664l,100.10);
		
        Laptop laptopSeven = new Laptop("Apple",128,656545664l,100.100,true);
		
		Laptop laptopEight = new Laptop("Apple",128,656545664l,100.100,true,10.10f);

		Laptop laptopNine = new Laptop("Apple",128,656545664l,100.100f,true,'A');

    }
}


