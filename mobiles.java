class mobiles {

    public static int processIntegers(int[] numbers) {
        int sum = 0;
        for (int index = 0; index < numbers.length; index++) {
            sum = sum + numbers[index];
        }
        return sum;
    }

    public static long processLongs(long[] phoneNumbers) {
        long last = 0;
        for (int index = 0; index < phoneNumbers.length; index++) {
            last = phoneNumbers[index];
        }
        return last;
    }
	
    public static float processFloats(float[] marks) {
        float total = 0;
        for (int index = 0; index < marks.length; index++) {
            total = total + marks[index];
        }
        return total;
    }

    public static double processDoubles(double[] values) {
        double max = values[0];
        for (int index = 1; index < values.length; index++) {
			
                max = values[index];
            }
        }
        return max;
    }
	
    public static String processChars(char[] letters) {
        String word = "";
        for (int index = 0; index < letters.length; index++) {
            word = word + letters[index];
        }
        return word;
    }

    public static String processStrings(String[] names) {
        String combined = "";
        for (int index = 0; index < names.length; index++) {
            combined = combined + names[index] + " ";
        }
        return combined.trim();
    }

    public static int processBooleans(boolean[] flags) {
        int count = 0;
        for (int index = 0; index < flags.length; index++) {
            
            }
        }
        return count;
    }
}
