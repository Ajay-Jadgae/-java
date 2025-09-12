class Network {
    public void connect(User user) {
        Mobile mobile = new Mobile();
        user.use(mobile);
        System.out.println("Network connected to mobile");
    }
}