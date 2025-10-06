class Student {

    public Student() {
        this("John");
        System.out.println("No argumental constructor.");
    }

    public Student(String name) {
        this("John", 101);
        System.out.println("One argumental constructor.");
        System.out.println("Name = " + name);
    }

    public Student(String name, int rollNo) {
        this("John", 101, "Computer Science");
        System.out.println("Two argumental constructor.");
        System.out.println("Name = " + name);
        System.out.println("Roll Number = " + rollNo);
    }

    public Student(String name, int rollNo, String branch) {
        this("John", 101, "Computer Science", 89.6);
        System.out.println("Three argumental constructor.");
        System.out.println("Name = " + name);
        System.out.println("Roll Number = " + rollNo);
        System.out.println("Branch = " + branch);
    }

    public Student(String name, int rollNo, String branch, double percentage) {
        this("John", 101, "Computer Science", 89.6, 'A');
        System.out.println("Four argumental constructor.");
        System.out.println("Name = " + name);
        System.out.println("Roll Number = " + rollNo);
        System.out.println("Branch = " + branch);
        System.out.println("Percentage = " + percentage);
    }

    public Student(String name, int rollNo, String branch, double percentage, char grade) {
        this("John", 101, "Computer Science", 89.6, 'A', true);
        System.out.println("Five argumental constructor.");
        System.out.println("Name = " + name);
        System.out.println("Roll Number = " + rollNo);
        System.out.println("Branch = " + branch);
        System.out.println("Percentage = " + percentage);
        System.out.println("Grade = " + grade);
    }

    public Student(String name, int rollNo, String branch, double percentage, char grade, boolean isPassed) {
        System.out.println("Six argumental constructor.");
        System.out.println("Name = " + name);
        System.out.println("Roll Number = " + rollNo);
        System.out.println("Branch = " + branch);
        System.out.println("Percentage = " + percentage);
        System.out.println("Grade = " + grade);
        System.out.println("Is Passed = " + isPassed);
    }
}
