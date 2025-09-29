class Rose{
	
	public String color;
	public int price;
	public char rating;
	public boolean isOrangeColor;
	public long numbers;
	
	
	public Rose(String color,int price,char rating,boolean isOrangeColor,long numbers){
		
		this.color=color;
		this.price=price;
		this.rating=rating;
		this.isOrangeColor=isOrangeColor;
		this.numbers=numbers;
	}
	
	public void displayRose(){
		
		System.out.println("the rose color is ="+color);
		System.out.println("the rose price is ="+price);
		System.out.println("the rose rating is ="+rating);
		System.out.println("the rose isOrangeColor is ="+isOrangeColor);
		
	}
}