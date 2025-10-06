class Camera {
	
	public String cameraBrand;
	public int cameraPrice;
	public Lens lens;
	
	public Camera(String cameraBrand, int cameraPrice, Lens lens) {
		this.cameraBrand = cameraBrand;
		this.cameraPrice = cameraPrice;
		this.lens = lens;
	}
	
	public void displayCameraDetails() {
		System.out.println("The camera brand is = " + cameraBrand);
		System.out.println("The camera price is = " + cameraPrice);
		System.out.println("The lens brand used in camera is = " + lens.lensBrand);
	}
}