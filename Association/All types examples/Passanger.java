class Passanger{
	
	public String passangerName;
	public int distance;
	public Driver driver;
	
	
	public Passanger(String passangerName,int distance,Driver driver){
		
		this.passangerName=passangerName;
		this.distance=distance;
		this.driver=driver;
	
	}
	public void displaypassanger(){
		
		System.out.println("passangerName is ="+passangerName);
		System.out.println("the distance is in km="+distance);
		System.out.println("driver name ="+driver.name);
		System.out.println("driver raideCost is ="+driver.raideCost);
		
		
	}
	
}
