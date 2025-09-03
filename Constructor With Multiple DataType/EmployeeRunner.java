class EmployeeRunner {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee();
		
        Employee employee2 = new Employee("Ramesh");
		
        Employee employee3 = new Employee("Ramesh", 101);
		
        Employee employee4 = new Employee("Ramesh", 101,60000);
		
        Employee employee5 = new Employee("Ramesh", 101,60000, true);
		
        Employee employee6 = new Employee("Ramesh", 101, 60000, true, 4.2f);
		
        Employee employee7 = new Employee("Ramesh", 101,60000, true, 4.2f, 'A');
    }
}
