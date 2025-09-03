class Employee {

    public static String name;
    public static int empId;
    public static long phone;
    public static float experience;
    public static double salary;
    public static boolean isPermanent;
    public static char grade;

    public static void info() {
        System.out.println("Value before reassigning = " + name);
        name = "Ajay";
        System.out.println("Value After reassigning = " + name);

        System.out.println("Value before reassigning = " + empId);
        empId = 1001;
        System.out.println("Value After reassigning = " + empId);

        System.out.println("Value before reassigning = " + phone);
        phone = 9876543210L;
        System.out.println("Value After reassigning = " + phone);

        System.out.println("Value before reassigning = " + experience);
        experience = 5.5f;
        System.out.println("Value After reassigning = " + experience);

        System.out.println("Value before reassigning = " + salary);
        salary = 75000.99;
        System.out.println("Value After reassigning = " + salary);

        System.out.println("Value before reassigning = " + isPermanent);
        isPermanent = true;
        System.out.println("Value After reassigning = " + isPermanent);

        System.out.println("Value before reassigning = " + grade);
        grade = 'A';
        System.out.println("Value After reassigning = " + grade);
    }
}

