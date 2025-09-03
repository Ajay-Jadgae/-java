class Person {

    public Person() {
        System.out.println("Default Person Constructor");
    }

    public Person(String name) {
        System.out.println("Name = " + name);
    }

    public Person(String name, int age) {
        System.out.println("Age = " + age);
    }

    public Person(String name, int age, double height) {
        System.out.println("Height = " + height);
    }

    public Person(String name, int age, double height, boolean isMarried) {
        System.out.println("Married = " + isMarried);
    }

    public Person(String name, int age, double height,boolean isMarried, float rating) {
        System.out.println("Rating = " + rating);
    }

    public Person(String name, int age, double height,boolean isMarried, float rating, char grade) {
        System.out.println("Grade = " + grade);
    }
}
