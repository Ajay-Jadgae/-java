class ZooRunner {
    public static void main(String[] args) {
        Animal lion = new Animal("Leo", "Lion");
        Cage cage = new Cage(5);
        Zookeeper keeper = new Zookeeper("Ramesh");

        Zoo zoo = new Zoo("City Zoo", lion, cage, keeper);
        zoo.displayZooInfo();
    }
}
