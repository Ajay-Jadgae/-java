class SmartphoneRunner {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();

        phone.display("Galaxy S23");
        phone.display("Galaxy S23", 101);
        phone.display("Galaxy S23", 101, 9876543210L);
        phone.display("Galaxy S23", 101, 9876543210L, 0.195f);
        phone.display("Galaxy S23", 101, 9876543210L, 0.195f, 1199.99);
        phone.display("Galaxy S23", 101, 9876543210L, 0.195f, 1199.99, 'F');
        phone.display("Galaxy S23", 101, 9876543210L, 0.195f, 1199.99, 'F', true);
        phone.display("Galaxy S23", 101, 9876543210L, 0.195f, 1199.99, 'F', true, (byte)24, (short)4500);
    }
}
