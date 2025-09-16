class SchoolRunner {
    public static void main(String[] args) {
        School school = new School();

        Staff s1 = new Staff("Mr. Sharma", "Principal", 80000);
        Staff s2 = new Staff("Mrs. Gupta", "Math Teacher", 45000);
        Staff s3 = new Staff("Mr. Verma", "Science Teacher", 42000);
        Staff s4 = new Staff("Ms. Rani", "English Teacher", 40000);
        Staff s5 = new Staff("Mr. Raj", "Clerk", 25000);

        Staff[] staffList = { s1, s2, s3, s4, s5 };

        school.showStaff(staffList);
    }
}
