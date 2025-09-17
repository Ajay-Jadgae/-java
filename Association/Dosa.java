class Dosa{
	
	public int price;
	public Samber samber;
	
	public Dosa(int price){
		
		this.price=price;
		
	}
	
	public void displayInfo(Samber samber){
		
		this.samber=samber;
		System.out.println("The price of dosa is = "+price);
		
	}
	
}