class Phone {
    public String phoneName;
    public Processor processor;
    public RAM ram;
    public Storage storage;

    public Phone(String phoneName, Processor processor, RAM ram, Storage storage) {
        this.phoneName = phoneName;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public void displayPhoneInfo() {
        System.out.println("Phone Name = " + phoneName);
        System.out.println("Processor = " + processor.processorName);
        System.out.println("RAM = " + ram.ramSize);
        System.out.println("Storage = " + storage.storageSize);
    }
}