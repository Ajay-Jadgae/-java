class SamberRunner{
	
	public static void main(String [] args){
		
		Idli idli = new Idli(100);
		Samber samber = new Samber("Good");
		
		idli.displayInfo(samber);
		samber.displayQuality();
		
		
	}
	
}