class Icecream{
	
	
	public String nameOfIcecream;
	public int price;
	public char rating;
	public boolean isSugarLess;
	
	
	public Icecream(String nameOfIcecream,int price,char rating,boolean isSugarLess){
		
		this.nameOfIcecream=nameOfIcecream;
		this.price=price;
		this.rating=rating;
		this.isSugarLess=isSugarLess;
	} 
	
	
	public void displayIcecream(){
		
		System.out.println("The iceceam name is ="+nameOfIcecream);
		System.out.println("The iceceam price is ="+price);
		System.out.println("The iceceam rating is ="+rating);
		System.out.println("The iceceam isSugarLess is ="+isSugarLess);
		
	}
}






