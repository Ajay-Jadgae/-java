class Laptop {

    public Laptop() {
        System.out.println("Default Laptop Constructor");
    }

    public Laptop(String brand) {
        System.out.println("Brand = " + brand);
    }

    public Laptop(String brand, int ram) {
        System.out.println("RAM="+ram);
    }

    public Laptop(String brand, int ram, long storage) {
        System.out.println("Storage = " + storage);
    }

    public Laptop(String brand, int ram, long storage, double price) {
        System.out.println("Price = " + price);
    }

    public Laptop(String brand, int ram, long storage, double price, boolean isTouchScreen) {
        System.out.println("Touch Screen = " + isTouchScreen);
    }
    public Laptop(String brand, int ram, long storage, double price, boolean isTouchScreen,float rating) {
		System.out.println("rating="+rating);
	}
	public Laptop(String brand, int ram, long storage, double price, boolean isTouchScreen,float rating,char grade) {
	System.out.println("grade="+grade);	
	}


}
