class KeyBoard{
	
	public int price;
	public String brandName;
	public char rating;
	public long serialNumber;
	
	public KeyBoard(int price,String brandName,char rating,long serialNumber){
		
		this.price=price;
		this.brandName=brandName;
		this.rating=rating;
		this.serialNumber=serialNumber;
	}
	
	public void displayKeyBoard(){
		
		System.out.println("the keyBoard price is ="+price);
		System.out.println("the keyBoard brandName is ="+brandName);
		System.out.println("the keyBoard rating is ="+rating);
		System.out.println("the keyBoard serialNumber is ="+serialNumber);
		
		
	}
}