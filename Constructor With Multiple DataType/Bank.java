class Bank {

    public Bank() {
        System.out.println("Default Bank Constructor");
    }

    public Bank(String name) {
        System.out.println("Bank Name = " + name);
    }

    public Bank(String name, String branch) {
        System.out.println("Branch = " + branch);
    }

    public Bank(String name, String branch, int employees) {
        System.out.println("Employees = " + employees);
    }

    public Bank(String name, String branch, int employees, long customers) {
        System.out.println("Customers = " + customers);
    }

    public Bank(String name, String branch, int employees, long customers, double revenue) {
        System.out.println("Revenue = " + revenue);
    }

    public Bank(String name, String branch, int employees, long customers, double revenue, boolean isNationalized) {
        System.out.println("Nationalized = " + isNationalized);
    }

    public Bank(String name, String branch, int employees, long customers, double revenue, boolean isNationalized, char grade) {
        System.out.println("Grade = " + grade);
    }
}
