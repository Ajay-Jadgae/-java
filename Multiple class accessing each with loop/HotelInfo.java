class HotelInfo {
    public String hotelName;
    public int stars;

    public HotelInfo(String hotelName,int stars) {
        this.hotelName = hotelName;
        this.stars = stars;
    }

    public void displayHotelInfo() {
        System.out.println("Hotel: " + hotelName);
        System.out.println("Stars: " + stars);
    }
}


