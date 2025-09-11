class Jeans {
	
	public String brand = "Levis";
	public int waistSize = 32;
	public long barcode = 998877665544L;
	public double price = 2499.75;
	public float discount = 20.0f;
	public char fitType = 'S'; 
	public boolean isAvailable = false;
	
	public String brand() {
		System.out.println(brand);
		return brand;
	}
	
	public int waistSize() {
		System.out.println(waistSize);
		return waistSize;
	}
	
	public long barcode() {
		System.out.println(barcode);
		return barcode;
	}
	
	public double price() {
		System.out.println(price);
		return price;
	}
	
	public float discount() {
		System.out.println(discount);
		return discount;
	}
	
	public char fitType() {
		System.out.println(fitType);
		return fitType;
	}
	
	public boolean isAvailable() {
		System.out.println(isAvailable);
		return isAvailable;
	}
}
