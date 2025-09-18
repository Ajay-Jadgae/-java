class SIM {
    String provider;
    String number;

 public SIM(String provider, String number) {
        this.provider = provider;
        this.number = number;
    }

 public void displaySIM() {
        System.out.println("Provider: " + provider);
        System.out.println("Number: " + number);
    }
}

