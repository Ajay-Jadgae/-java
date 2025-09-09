class Festival {

    public String name = "Diwali";
    public int days = 5;
    public long peopleCelebrating = 1000000000L;
    public double avgSpending = 5000.75;
    public float happinessIndex = 95.5f;
    public char type = 'C'; 
    public boolean isNationalHoliday = true;

    public void displayInfo() {
        System.out.println("Festival Name = " + name);
        System.out.println("Days = " + days);
        System.out.println("People Celebrating = " + peopleCelebrating);
        System.out.println("Average Spending = " + avgSpending);
        System.out.println("Happiness Index = " + happinessIndex);
        System.out.println("Type = " + type);
        System.out.println("National Holiday = " + isNationalHoliday);
    }
}

