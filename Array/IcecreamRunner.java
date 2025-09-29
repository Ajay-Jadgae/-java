class IcecreamRunner{
	
	public static void main (String [] args){
		
		
		IcecreamInfo icecreamInfo=new IcecreamInfo();
		
		Icecream icecream1=new Icecream("chacobar",100,'A',true);
		Icecream icecream2=new Icecream("white",200,'A',false);
		Icecream icecream3=new Icecream("red",50,'A',true);
		Icecream icecream4=new Icecream("green",25,'A',false);
		Icecream icecream5=new Icecream("yellow",80,'A',true);
		
		Icecream []colors={icecream1,icecream2,icecream3,icecream4,icecream5};

		
		
		
		icecreamInfo.icecreamTypes(colors);
		
		
	}
	
}