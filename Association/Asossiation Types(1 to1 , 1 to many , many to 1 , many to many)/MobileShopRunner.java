class MobileShopRunner{
	
	public static void main (String [] args){
		
		Samsung samsung=new Samsung(25000);
		
		Iphone iphone=new Iphone(50000);
		
		OnePlus onePlus=new OnePlus(45000);
		
		
		MobileShop shop=new MobileShop("mobile world",5,samsung,iphone,onePlus);
		
		shop.displayMobileShopInfo();
	}
	
}