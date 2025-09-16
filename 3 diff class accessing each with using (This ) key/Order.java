class Order {

    public void showOrder(Item[] items) {
        System.out.println("Total Items Ordered=" + items.length);

        for (int num = 0; num < items.length; num++) {
           Item orders=items[num];
		   orders.displayItem();
		   
        }
       
    }
}