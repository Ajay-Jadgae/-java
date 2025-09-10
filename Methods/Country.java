class Country {
    public String countryName = "India";

    public void show(State state) {
        state.stateName();  
        System.out.println("The country name is = " + countryName);
    }
}