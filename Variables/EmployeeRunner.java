class EmployeeRunner {
    public static void main(String[] args) {
        Employee.name = "Ravi";
        Employee.empId = 2002;
        Employee.phone = 1122334455L;
        Employee.experience = 2.3f;
        Employee.salary = 50000.45;
        Employee.isPermanent = false;
        Employee.grade = 'B';

        Employee.info();
    }
}
