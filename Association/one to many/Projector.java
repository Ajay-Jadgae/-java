class Projector {
	
	public String projectorBrand;
	public int projectorPrice;
	public Lens lens;
	
	public Projector(String projectorBrand, int projectorPrice, Lens lens) {
		this.projectorBrand = projectorBrand;
		this.projectorPrice = projectorPrice;
		this.lens = lens;
	}
	
	public void displayProjectorDetails() {
		System.out.println("The projector brand is = " + projectorBrand);
		System.out.println("The projector price is = " + projectorPrice);
		System.out.println("The lens brand used in projector is = " + lens.lensBrand);
	}
}