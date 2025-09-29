class Restaurant {
    public String restaurantName;
    public Chef chef;
    public Waiter waiter;
    public Menu menu;

    public Restaurant(String restaurantName, Chef chef, Waiter waiter, Menu menu) {
        this.restaurantName = restaurantName;
        this.chef = chef;
        this.waiter = waiter;
        this.menu = menu;
    }

    public void displayRestaurantInfo() {
        System.out.println("Restaurant Name: " + restaurantName);
        System.out.println("Chef Name: " + chef.name);
        System.out.println("Waiter Name: " + waiter.name);
        System.out.println("Menu: " + menu.menuName);
    }
}