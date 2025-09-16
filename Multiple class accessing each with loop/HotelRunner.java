class HotelRunner {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        HotelInfo hotel1 = new HotelInfo("Taj Palace",500);
        HotelInfo hotel2 = new HotelInfo("ITC Gardenia",400);
        HotelInfo hotel3 = new HotelInfo("Holiday Inn",600);

        HotelInfo[] hotelList = { hotel1, hotel2, hotel3 };
        hotel.displayHotels(hotelList);
    }
}
