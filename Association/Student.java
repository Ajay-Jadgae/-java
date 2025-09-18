class Student {
    String name;
    int rollNo;
    College college;   

  public Student(String name, int rollNo, College college) {
        this.name = name;
        this.rollNo = rollNo;
        this.college = college;
    }

  public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Roll No: " + college.collegeName);
        System.out.println("Roll No: " + college.location);
        college.displayCollege();  
    }
}
