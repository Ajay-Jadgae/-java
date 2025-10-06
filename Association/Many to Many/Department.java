class Department {
    public String deptName;
    public Employee employee;

    public Department(String deptName, Employee employee) {
        this.deptName = deptName;
        this.employee = employee;
    }

    public void displayDepartment() {
        System.out.println("Department Name = " + deptName);
        employee.displayEmployee();
    }
}