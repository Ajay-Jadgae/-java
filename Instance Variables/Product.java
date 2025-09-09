class Product {

    public String name = "Laptop";
    public int productId = 101;
    public long barcode = 987654321012L;
    public double price = 55000.99;
    public float discount = 10.5f; 
    public char category = 'E'; 
    public boolean inStock = true;

    public void displayInfo() {
        System.out.println("Product Name = " + name);
        System.out.println("Product ID = " + productId);
        System.out.println("Barcode = " + barcode);
        System.out.println("Price = " + price);
        System.out.println("Discount = " + discount );
        System.out.println("Category = " + category);
        System.out.println("In Stock = " + inStock);
    }
}

