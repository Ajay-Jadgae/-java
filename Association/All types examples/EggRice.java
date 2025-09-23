class EggRice{
	
	public int price;
	
	public Egg egg;
	
	public EggRice(int price,Egg egg){
		
		this.price=price;
		this.egg=egg;
		
	}
	
	public void displayEggRice(){
		
		System.out.println("the egg rice price is ="+price);
		
		System.out.println("egg="+egg.numberOfEgg);
		
	}
}




