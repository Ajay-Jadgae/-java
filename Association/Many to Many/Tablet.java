class Tablet {
    public String tabletName;
    public Processor processor;
    public RAM ram;
    public Storage storage;

    public Tablet(String tabletName, Processor processor, RAM ram, Storage storage) {
        this.tabletName = tabletName;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public void displayTabletInfo() {
        System.out.println("Tablet Name = " + tabletName);
        System.out.println("Processor = " + processor.processorName);
        System.out.println("RAM = " + ram.ramSize);
        System.out.println("Storage = " + storage.storageSize);
    }
}