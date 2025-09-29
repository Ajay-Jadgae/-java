class HpLaptopRunner {
    public static void main(String[] args) {
        HpLaptop laptop = new HpLaptop();

        laptop.display("Dell XPS");
        laptop.display("Dell XPS", 2023);
        laptop.display("Dell XPS", 2023, 123456789L);
        laptop.display("Dell XPS", 2023, 123456789L, 1.25f);
        laptop.display("Dell XPS", 2023, 123456789L, 1.25f, 1499.99);
        laptop.display("Dell XPS", 2023, 123456789L, 1.25f, 1499.99, 'P');
        laptop.display("Dell XPS", 2023, 123456789L, 1.25f, 1499.99, 'P', true);
        laptop.display("Dell XPS", 2023, 123456789L, 1.25f, 1499.99, 'P', true, (byte)24, (short)16);
    }
}
