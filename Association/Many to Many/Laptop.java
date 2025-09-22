class Laptop {
    public String laptopName;
    public Processor processor;
    public RAM ram;
    public Storage storage;

    public Laptop(String laptopName, Processor processor, RAM ram, Storage storage) {
        this.laptopName = laptopName;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public void displayLaptopInfo() {
        System.out.println("Laptop Name = " + laptopName);
        System.out.println("Processor = " + processor.processorName);
        System.out.println("RAM = " + ram.ramSize);
        System.out.println("Storage = " + storage.storageSize);
    }
}