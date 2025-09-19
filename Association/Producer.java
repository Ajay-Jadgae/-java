class Producer {
    public String producerName;
    public String company;

    public Producer(String producerName, String company) {
        this.producerName = producerName;
        this.company = company;
    }

    public void displayProducer() {
        System.out.println("Producer = " + producerName);
        System.out.println("Production House = " + company);
    }
}
