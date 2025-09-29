class ComputerRunner {
    public static void main(String[] args) {
        CPU cpu = new CPU("Intel i7", 4.2);
        RAM ram = new RAM(16);

        Computer pc = new Computer("Gaming PC", cpu, ram);
        pc.displayComputer();
    }
}