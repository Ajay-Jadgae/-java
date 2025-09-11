class Television {
	
	public String brand = "Sony";
	public int screenSize = 55;
	public long modelNumber = 987654321234L;
	public double price = 65999.50;
	public float refreshRate = 120.0f;
	public char grade = 'B';
	public boolean isSmartTV = true;
	
	public String brand() {
		System.out.println(brand);
		return brand;
	}
	
	public int screenSize() {
		System.out.println(screenSize);
		return screenSize;
	}
	
	public long modelNumber() {
		System.out.println(modelNumber);
		return modelNumber;
	}
	
	public double price() {
		System.out.println(price);
		return price;
	}
	
	public float refreshRate() {
		System.out.println(refreshRate);
		return refreshRate;
	}
	
	public char grade() {
		System.out.println(grade);
		return grade;
	}
	
	public boolean isSmartTV() {
		System.out.println(isSmartTV);
		return isSmartTV;
	}
}


