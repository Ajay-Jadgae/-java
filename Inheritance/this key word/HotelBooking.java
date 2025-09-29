class HotelBooking {
    
    public HotelBooking() {
        this("Standard Room");
        System.out.println("No-arg constructor called");
    }

    public HotelBooking(String roomType) {
        this(roomType, 1);
        System.out.println("Constructor with roomType: " + roomType);
    }

    public HotelBooking(String roomType, int nights) {
        this(roomType, nights, true);
        System.out.println("Constructor with roomType & nights: " + roomType + ", Nights=" + nights);
    }

    public HotelBooking(String roomType, int nights, boolean breakfastIncluded) {
        this(roomType, nights, breakfastIncluded, 2);
        System.out.println("Constructor with breakfast option: " + breakfastIncluded);
    }

    public HotelBooking(String roomType, int nights, boolean breakfastIncluded, int numberOfGuests) {
        this(roomType, nights, breakfastIncluded, numberOfGuests, 1500.0);
        System.out.println("Constructor with number of guests: " + numberOfGuests);
    }

    public HotelBooking(String roomType, int nights, boolean breakfastIncluded, int numberOfGuests, double pricePerNight) {
        this(roomType, nights, breakfastIncluded, numberOfGuests, pricePerNight, "Full Board");
        System.out.println("Constructor with pricePerNight: " + pricePerNight);
    }

    public HotelBooking(String roomType, int nights, boolean breakfastIncluded, int numberOfGuests, double pricePerNight, String mealPlan) {
        System.out.println("Full Constructor:");
        System.out.println("Room Type = " + roomType);
        System.out.println("Nights = " + nights);
        System.out.println("Breakfast Included = " + breakfastIncluded);
        System.out.println("Number of Guests = " + numberOfGuests);
        System.out.println("Price per Night = " + pricePerNight);
        System.out.println("Meal Plan = " + mealPlan);
    }
}

