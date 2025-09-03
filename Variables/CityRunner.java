class CityRunner {
    public static void main(String[] args) {
        City.name = "Mysuru";
        City.population = 3000000;
        City.area = 200000L;
        City.literacyRate = 85.3f;
        City.gdp = 65000.45;
        City.isCapital = false;
        City.rank = 'B';

        City.info();
    }
}
