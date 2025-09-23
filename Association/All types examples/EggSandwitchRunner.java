class EggSandwitchRunner{
	
	public static void main (String [] args){
		
		Egg eggsForRice=new Egg(2);
		
		Egg eggForSandwich=new Egg(5);
		
		EggRice eggRice=new EggRice(100,eggsForRice);

		EggSandwitch eggSandwitch=new EggSandwitch("egg sandwich",eggForSandwich);
		
		eggRice.displayEggRice();
		eggSandwitch.displayEggSandwitch();
		
	}
	
}