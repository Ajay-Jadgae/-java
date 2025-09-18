class StudentRunner {
    public static void main(String[] args) {
        College college = new College("IIT Delhi", "Delhi");
        Student name = new Student("Ajay", 101, college);

        name.displayStudent();
    }
}
