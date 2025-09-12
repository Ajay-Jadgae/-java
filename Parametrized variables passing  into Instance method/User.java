class User {
    public void use(Mobile mobile) {
        Battery battery = new Battery();
        mobile.start(battery);
        System.out.println("User is using the mobile");
    }
}