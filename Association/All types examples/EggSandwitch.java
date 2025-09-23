class EggSandwitch{
	
	public String name;
	
	public Egg egg;
	
	public EggSandwitch(String name,Egg egg){
		
		this.name=name;
		this.egg=egg;	
		
	}
	
	public void displayEggSandwitch(){
		
		System.out.println("the EggSandwitch name is ="+name);
		System.out.println("the numberOfEgg used in EggSandwitch="+egg.numberOfEgg);
		
	}
	
}