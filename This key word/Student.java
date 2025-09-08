class Student {
    
    public static String name;
    public static int rollNo;
    public static long phone;
    public static double marks;
    public static float attendance;
    public static char grade;
    public static boolean isPromoted;

    public Student(String name, int rollNo, long phone, double marks, float attendance, char grade, boolean isPromoted) {
        this.name = name;
        this.rollNo = rollNo;
        this.phone = phone;
        this.marks = marks;
        this.attendance = attendance;
        this.grade = grade;
        this.isPromoted = isPromoted;

        System.out.println("Name = " + this.name);
        System.out.println("Roll No = " + this.rollNo);
        System.out.println("Phone = " + this.phone);
        System.out.println("Marks = " + this.marks);
        System.out.println("Attendance = " + this.attendance);
        System.out.println("Grade = " + this.grade);
        System.out.println("Is Promoted = " + this.isPromoted);
    }
}
