class Item {
    public String name;
    public int price;
    
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void displayItem() {
		
        System.out.println("Item: " + name + " s" + price );
    }

    
}


