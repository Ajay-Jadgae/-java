class DosaRunner{
	
	public static void main (String [] args){
		
		DosaInfo dosaInfo=new DosaInfo();
		
		PlaneDosa oilOne=new PlaneDosa("dosa king",250,'A',5465315l,true);
		PlaneDosa oilTwo=new PlaneDosa("desi masala",522,'A',5465315l,false);
		PlaneDosa oilThree=new PlaneDosa("magic dosa",100,'A',5468815l,true);
		PlaneDosa oilFour=new PlaneDosa("village style",900,'A',322555315l,false);
		PlaneDosa oiFive=new PlaneDosa("kanti hotel",888,'A',5458555l,false);
		
		PlaneDosa [] shopes={oilOne,oilTwo,oilThree,oilFour,oiFive};
		
		
		dosaInfo.dosaDetails(shopes);
		
	}
	
}