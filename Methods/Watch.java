class Watch {
	
	public String brand = "Rolex";
	public int warrantyYears = 5;
	public long serialNumber = 998877665544L;
	public double price = 550000.99;
	public float dialSize = 42.5f;
	public char quality = 'A';
	public boolean isWaterproof = true;
	
	public String brand() {
		System.out.println(brand);
		return brand;
	}
	
	public int warrantyYears() {
		System.out.println(warrantyYears);
		return warrantyYears;
	}
	
	public long serialNumber() {
		System.out.println(serialNumber);
		return serialNumber;
	}
	
	public double price() {
		System.out.println(price);
		return price;
	}
	
	public float dialSize() {
		System.out.println(dialSize);
		return dialSize;
	}
	
	public char quality() {
		System.out.println(quality);
		return quality;
	}
	
	public boolean isWaterproof() {
		System.out.println(isWaterproof);
		return isWaterproof;
	}
}

