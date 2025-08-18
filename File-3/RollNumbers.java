class RollNumbers {
    public static void main(String[] args) {

        int ajay1 = 101;
        int ram2 = 102;
        int raju3 = 103;
        int ravi4 = 104;
        int krish5 = 105;
        int rahul6 = 106;
        int rohith7 = 107;
        int abhi8 = 108;

        int[] rolls = {
            ajay1, ram2, raju3, ravi4,
            krish5, rahul6, rohith7, abhi8
        };

        for (int rollIndex = 0; rollIndex < rolls.length; rollIndex++) {
            int rollNumber = rolls[rollIndex];
            System.out.println(rollNumber);
        }
    }
}
