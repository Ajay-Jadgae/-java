class Employee {
    public String name;
    public int id;
    public double salary;
    public Address address;

    public Employee(String name, int id, double salary, Address address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.address = address;
    }

    public void displayEmployee() {
        System.out.println("Employee Name = " + name);
        System.out.println("Employee ID = " + id);
        System.out.println("Salary = " + salary);
        address.displayAddress();
    }
}