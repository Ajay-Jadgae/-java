class StudentAttendance {
    public static void main(String[] args) {

        float ajay = 85.5f;
        float virat= 90.0f;
        float rohit = 76.4f;
        float ram = 88.2f;
        float raju = 92.3f;
        float ravi = 79.5f;
        float roshan = 83.0f;
        float aj = 91.8f;

        float[] attendance = {
            ajay, virat, rohit, ram,
            raju, ravi, roshan, aj
        };

        for (int studentIndex = 0; studentIndex < attendance.length; studentIndex++) {
            float percentage = attendance[studentIndex];
            System.out.println(percentage );
        }
    }
}
