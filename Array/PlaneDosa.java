class PlaneDosa{
	
	public String shopeName;
	public int price;
	public char rating;
	public long shopeNumber;
	public boolean isGood;
	
	
	public PlaneDosa(String shopeName,int price,char rating,long shopeNumber,boolean isGood){
		
		this.shopeName=shopeName;
		this.price=price;
		this.rating=rating;
		this.shopeNumber=shopeNumber;
		this.isGood=isGood;
		
	}
	
	public void displayDosa(){
		
		System.out.println("The dosa shopeName is="+shopeName);
		System.out.println("The dosa price is="+price);
		System.out.println("The dosa rating is="+rating);
		System.out.println("The dosa shopeNumber is="+shopeNumber);
		System.out.println("The dosa isGood is="+isGood);
		
	}
}






