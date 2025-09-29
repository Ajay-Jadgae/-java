class RoseRunner{
	
	public static void main (String [] args){
		
		RoseInfo roseInfo=new RoseInfo();
		
		Rose rose=new Rose("orange",500,'A',true,1245224l);
		Rose roseOne=new Rose("green",600,'A',false,10005224l);
		Rose roseTwo=new Rose("red",400,'A',true,12488824l);
		Rose roseThree=new Rose("white",100,'A',false,12444424l);
		Rose roseFour=new Rose("black",200,'A',true,12499924l);
		Rose roseFive=new Rose("blue",800,'A',false,1233334l);
		
		Rose [] flowers={rose,roseOne,roseTwo,roseThree,roseFour,roseFive};
		
		roseInfo.details(flowers);
		
	}
	
}