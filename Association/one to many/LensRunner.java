class LensRunner {
	public static void main(String[] args) {
		
		Lens lens = new Lens("Nikon");
		
		Camera camera = new Camera("Canon", 80000, lens);
		camera.displayCameraDetails();
		
		Projector projector = new Projector("Epson", 60000, lens);
		projector.displayProjectorDetails();
	}
}