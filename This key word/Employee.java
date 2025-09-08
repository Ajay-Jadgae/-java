class Employee {
    
    public static String name;
    public static int empId;
    public static long contact;
    public static double salary;
    public static float experience;
    public static char performance;
    public static boolean isPermanent;

    public Employee(String name, int empId, long contact, double salary, float experience, char performance, boolean isPermanent) {
        this.name = name;
        this.empId = empId;
        this.contact = contact;
        this.salary = salary;
        this.experience = experience;
        this.performance = performance;
        this.isPermanent = isPermanent;

        System.out.println("Name = " + this.name);
        System.out.println("Emp ID = " + this.empId);
        System.out.println("Contact = " + this.contact);
        System.out.println("Salary = " + this.salary);
        System.out.println("Experience = " + this.experience);
        System.out.println("Performance = " + this.performance);
        System.out.println("Is Permanent = " + this.isPermanent);
    }
}
