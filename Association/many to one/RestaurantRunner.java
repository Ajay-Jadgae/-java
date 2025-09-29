class RestaurantRunner {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon Ramsay");
        Waiter waiter = new Waiter("John");
        Menu menu = new Menu("Italian Special");

        Restaurant restaurant = new Restaurant("City Dine", chef, waiter, menu);
        restaurant.displayRestaurantInfo();
    }
}
