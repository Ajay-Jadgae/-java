class School {

    public School() {
        System.out.println("Default School Constructor");
    }

    public School(String name) {
        System.out.println("School Name = " + name);
    }

    public School(String name, String location) {
        System.out.println("Location = " + location);
    }

    public School(String name, String location, int students) {
        System.out.println("Students = " + students);
    }

    public School(String name, String location, int students, int teachers) {
        System.out.println("Teachers = " + teachers);
    }

    public School(String name, String location, int students, int teachers, boolean isPrivate) {
        System.out.println("Private = " + isPrivate);
    }

    public School(String name, String location, int students, int teachers, boolean isPrivate, float rating) {
        System.out.println("Rating = " + rating);
    }

    public School(String name, String location, int students, int teachers, boolean isPrivate, float rating, char grade) {
        System.out.println("Grade = " + grade);
    }
}
