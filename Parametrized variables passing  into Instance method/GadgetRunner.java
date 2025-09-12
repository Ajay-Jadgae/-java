class GadgetRunner {
    public static void main(String[] args) {
        Network network = new Network();
        Server server = new Server();
        server.serve(network);
    }
}
