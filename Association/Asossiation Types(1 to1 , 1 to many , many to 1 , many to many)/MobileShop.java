class MobileShop{
	public String shopName;
	public int numberOfMobiles;
	public Samsung samsung;
	public Iphone iphone;
	public OnePlus onePlus;
	
	public MobileShop(String shopName,int numberOfMobiles,Samsung samsung,Iphone iphone,OnePlus onePlus){
		
		this.shopName=shopName;
		this.numberOfMobiles=numberOfMobiles;
		this.samsung=samsung;
		this.iphone=iphone;
		this.onePlus=onePlus;
	}
	
	public void displayMobileShopInfo(){
		
		System.out.println("This is mobile shop class");
		System.out.println("shopName="+shopName);
		System.out.println("numberOfMobiles="+numberOfMobiles);
		System.out.println("samsung="+samsung.samsungPrice);
		System.out.println("iphone="+iphone.iphonePrice);
		System.out.println("onePlus="+onePlus.onePlusPrice);
			
			
		
		
		
	}



}