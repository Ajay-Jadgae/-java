class Grades {

    public char[] values = {'A', 'B', 'C', 'D', 'E'};

    public void grade() {
        for (int level = 0; level < values.length; level++) {
            System.out.println(values[level]);
        }
    }
}

