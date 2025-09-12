class Server {
    public void serve(Network network) {
        User user = new User();
        network.connect(user);
        System.out.println("Server is serving the network");
    }
}