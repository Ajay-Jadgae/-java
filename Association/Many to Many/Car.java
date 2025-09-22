class Car{
	
	
	public String carName;
	public Engine engine;
	public Wheels wheels;
	public Seats seats;
	
	
	public Car(String carName,Engine engine,Wheels wheels,Seats seats){
		
		
		this.carName=carName;
		this.engine=engine;
		this.wheels=wheels;
		this.seats=seats;
	}
	
	
	public void displayCarInfo(){
		
		System.out.println("This is car info=");
		System.out.println("carName="+carName);
		System.out.println("engine="+engine.power);
		System.out.println("wheels="+wheels.numberOfWheels);
		System.out.println("seats="+seats.numberOfSeats);
		
	}
}