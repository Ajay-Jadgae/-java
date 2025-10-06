class Mobile extends Brand {
	
	public int modelId;
	public String modelName;
	public long imeiNumber;
	public double price;
	public float screenSize;
	public char qualityGrade;
	public boolean is5G;

	public Mobile() {
		super();
		System.out.println("This is no argumental constructor in Mobile class.");
	}

	public Mobile(int modelId, String modelName, long imeiNumber, double price, float screenSize, char qualityGrade, boolean is5G) {
		
		this();

		super.brandId = modelId;
		super.brandName = modelName;
		super.customerCare = imeiNumber;
		super.averagePrice = price;
		super.rating = screenSize;
		super.category = qualityGrade;
		super.isTopBrand = is5G;

		this.modelId = modelId;
		this.modelName = modelName;
		this.imeiNumber = imeiNumber;
		this.price = price;
		this.screenSize = screenSize;
		this.qualityGrade = qualityGrade;
		this.is5G = is5G;
	}

	public void displayDetails() {
		
		System.out.println("Brand class details:");
		System.out.println("Brand ID = " + super.brandId);
		System.out.println("Brand Name = " + super.brandName);
		System.out.println("Customer Care = " + super.customerCare);
		System.out.println("Average Price = " + super.averagePrice);
		System.out.println("Rating = " + super.rating);
		System.out.println("Category = " + super.category);
		System.out.println("Is Top Brand = " + super.isTopBrand);

		System.out.println("\nMobile class details:");
		System.out.println("Model ID = " + this.modelId);
		System.out.println("Model Name = " + this.modelName);
		System.out.println("IMEI Number = " + this.imeiNumber);
		System.out.println("Price = " + this.price);
		System.out.println("Screen Size = " + this.screenSize);
		System.out.println("Quality Grade = " + this.qualityGrade);
		System.out.println("Is 5G Supported = " + this.is5G);
	}
}