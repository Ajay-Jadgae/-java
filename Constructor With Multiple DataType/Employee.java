class Employee {

    public Employee() {
        System.out.println("Default Employee Constructor");
    }

    public Employee(String name) {
        System.out.println("Name = " + name);
    }

    public Employee(String name, int id) {
        System.out.println("ID = " + id);
    }
    
    public Employee(String name, int id, double salary) {
        System.out.println("Salary = " + salary);
    }

    public Employee(String name, int id,double salary, boolean isPermanent) {
        System.out.println("Permanent = " + isPermanent);
    }

    public Employee(String name, int id, String department,boolean isPermanent, float rating) {
        System.out.println("Rating = " + rating);
    }

    public Employee(String name, int id, String department,boolean isPermanent, float rating, char grade) {
        System.out.println("Grade = " + grade);
    }
}
