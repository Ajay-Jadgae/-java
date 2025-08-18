class Temperatures {
    public static void main(String[] args) {

        short morningTemp = -5;
        short afternoonTemp = 0;
        short eveningTemp = -2;
        short nightTemp = -10;
        short peakTemp = -12;
        short baseCampTemp = 2;
        short snowfallTemp = -8;
        short tentTemp = -4;

        short[] temperatures = {
            morningTemp, afternoonTemp, eveningTemp, nightTemp,
            peakTemp, baseCampTemp, snowfallTemp, tentTemp
        };

        for (int timeIndex = 0; timeIndex < temperatures.length; timeIndex++) {
            short temp = temperatures[timeIndex];
            System.out.println(temp);
        }
    }
}
