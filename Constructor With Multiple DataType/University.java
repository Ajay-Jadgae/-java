class University {

    public University() {
        System.out.println("Default University Constructor");
    }

    public University(String name) {
        System.out.println("University Name = " + name);
    }

    public University(String name, String location) {
        System.out.println("Location = " + location);
    }

    public University(String name, String location, int colleges) {
        System.out.println("Colleges = " + colleges);
    }

    public University(String name, String location, int colleges, long students) {
        System.out.println("Students = " + students);
    }

    public University(String name, String location, int colleges, long students, double ranking) {
        System.out.println("Ranking = " + ranking);
    }

    public University(String name, String location, int colleges, long students, double ranking, boolean isPublic) {
        System.out.println("Public = " + isPublic);
    }

    public University(String name, String location, int colleges, long students, double ranking, boolean isPublic, char grade) {
        System.out.println("Grade = " + grade);
    }
}
