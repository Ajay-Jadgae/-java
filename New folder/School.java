class School {
    public String schoolName = "Sunrise School";

    public void showDetails(Student student) {
        student.printName();  
        System.out.println("School Name = " + schoolName);
    }
}