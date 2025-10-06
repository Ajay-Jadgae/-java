class Address {
    public String city;
    public String state;
    public int pinCode;

    public Address(String city, String state, int pinCode) {
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    public void displayAddress() {
        System.out.println("City = " + city);
        System.out.println("State = " + state);
        System.out.println("Pin Code = " + pinCode);
    }
}







