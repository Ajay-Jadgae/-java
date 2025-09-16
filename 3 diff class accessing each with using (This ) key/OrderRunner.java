class OrderRunner {
    public static void main(String[] args) {
        Order order = new Order();

        Item item1 = new Item("Laptop", 60000);
        Item item2 = new Item("Headphones", 2000);
        Item item3 = new Item("Smartphone", 30000);
        Item item4 = new Item("USB Cable", 500);

        Item[] cart = { item1, item2, item3, item4 };

        order.showOrder(cart);
  }
}
