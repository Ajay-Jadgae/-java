class mobilesRunner {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};
        System.out.println("Sum of Integers = " + mobiles.processIntegers(numbers));

        long[] phoneNumbers = {9876543210L, 8765432109L, 7654321098L};
        System.out.println("Last Phone Number = " + mobiles.processLongs(phoneNumbers));

        float[] marks = {80.5f, 90.0f, 75.5f, 85.0f};
        System.out.println("Average Marks = " + mobiles.processFloats(marks));

        double[] values = {4.5, 9.8, 7.2, 6.9};
        System.out.println("Maximum Double Value = " + mobiles.processDoubles(values));

        char[] letters = {'J', 'A', 'V', 'A'};
        System.out.println("Word from Characters = " + mobiles.processChars(letters));

        String[] names = {"Ajay", "Virat", "Krishna", "Ram"};
        System.out.println("Combined Names = " + mobiles.processStrings(names));

        boolean[] flags = {true, false, true, true, false};
        System.out.println("Number of True Values = " + mobiles.processBooleans(flags));
    }
}
