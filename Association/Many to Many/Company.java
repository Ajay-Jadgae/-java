class Company {
    public String companyName;
    public Department department;

    public Company(String companyName, Department department) {
        this.companyName = companyName;
        this.department = department;
    }

    public void displayCompany() {
        System.out.println("----- Company Information -----");
        System.out.println("Company Name = " + companyName);
        department.displayDepartment();
    }
}