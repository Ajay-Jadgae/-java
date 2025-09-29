class Computer {
    public String name;
    public CPU cpu;
    public RAM ram;

    public Computer(String name, CPU cpu, RAM ram) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
    }

    public void displayComputer() {
        System.out.println("Computer Name= " + name);
        cpu.displayCPU();
        ram.displayRAM();
    }
}