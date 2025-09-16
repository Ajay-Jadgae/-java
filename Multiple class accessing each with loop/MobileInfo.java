class MobileInfo {
    public String mobileName;
    public int mobilePrice;

    public MobileInfo(String mobileName, int mobilePrice) {
        this.mobileName = mobileName;
        this.mobilePrice = mobilePrice;
    }

    public void displayMobileInfo() {
        System.out.println(mobileName);
        System.out.println(mobilePrice);
    }
}


