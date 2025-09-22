
class GadgetRunner {
    public static void main(String[] args) {
        Processor i5 = new Processor("Intel i5");
        Processor snapdragon = new Processor("Snapdragon 888");
        Processor m1 = new Processor("Apple M1");

        RAM ram8 = new RAM(8);
        RAM ram12 = new RAM(12);
        RAM ram16 = new RAM(16);

        Storage ssd512 = new Storage(512);
        Storage storage256 = new Storage(256);
        Storage storage128 = new Storage(128);

        Laptop laptop = new Laptop("Dell Inspiron", i5, ram16, ssd512);
        Phone phone = new Phone("Samsung Galaxy", snapdragon, ram8, storage256);
        Tablet tablet = new Tablet("iPad Air", m1, ram12, storage128);

        laptop.displayLaptopInfo();
        phone.displayPhoneInfo();
        tablet.displayTabletInfo();
    }
}