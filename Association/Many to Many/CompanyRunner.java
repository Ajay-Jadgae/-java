class CompanyRunner {
    public static void main(String[] args) {
        Address address = new Address("Bangalore", "Karnataka", 560001);
        Employee employee = new Employee("Ajay", 101, 55000.0, address);
        Department department = new Department("Software Development", employee);
        Company company = new Company("TechVision Pvt Ltd", department);

        company.displayCompany();
    }
}
