class Staff {
    public String name;
    public String role;
    public int salary;

   
    public Staff(String name, String role, int salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public void displayStaff() {
        System.out.println("Name: " + name + " | Role: " + role + " | Salary: ₹" + salary);
    }
}



